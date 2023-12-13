package ru.miit.lab4validate;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;


/**
 * Created by Андрей on 18.02.2017.
 */
public class Lab4Start {

    public static void main(String args[]) throws Exception {

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        try {

            Train train = new Train();
            train.setId(0);
            train.setName("Train");
            train.setHorsePower(500);
            train.setMaxSpeed(-1);
            train.setMaxDistance(500);
            train.setCrewCount(10);
            Set<ConstraintViolation<Train>> violationsTrain = validator.validate(train);

            System.out.println("Найдены следующие нарушения: ");
            for (ConstraintViolation<Train> viol : violationsTrain) {
                System.out.println("Нарушение: " + "Поле: " + viol.getPropertyPath() + " значение: " + viol.getInvalidValue() + "   " + viol.getMessage());
            }

            TrainXML trainXML = new TrainXML();
            trainXML.setId(0);
            trainXML.setName("Train");
            trainXML.setHorsePower(500);
            trainXML.setMaxSpeed(-1);
            trainXML.setMaxDistance(500);
            trainXML.setCrewCount(10);
            Set<ConstraintViolation<TrainXML>> violationsTrainXML = validator.validate(trainXML);

            System.out.println("Найдены следующие нарушения: ");
            for (ConstraintViolation<TrainXML> viol : violationsTrainXML) {
                System.out.println("Нарушение: " + "Поле: " + viol.getPropertyPath() + " значение: " + viol.getInvalidValue() + "   " + viol.getMessage());
            }

        } finally {
            factory.close();
        }
    }
}
