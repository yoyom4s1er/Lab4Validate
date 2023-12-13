package ru.miit.lab4validate;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class TrainXML {
    private long id;

    private String name;

    private float horsePower;

    private float maxSpeed;

    private float maxDistance;

    private int crewCount;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHorsePower(float horsePower) {
        this.horsePower = horsePower;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setMaxDistance(float maxDistance) {
        this.maxDistance = maxDistance;
    }

    public void setCrewCount(int crewCount) {
        this.crewCount = crewCount;
    }
}
