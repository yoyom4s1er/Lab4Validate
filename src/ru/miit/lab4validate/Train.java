package ru.miit.lab4validate;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Train {

    @Min(value = 1, message = "Значение идентификатора должно быть > 0")
    private long id;

    @NotNull(message = "Название поезда должно быть задано")
    @Size(min = 3, max = 255, message = "Количество символов должно быть от 3 до 255")
    @Pattern(message = "Название должно быть с большой буквы",
            regexp = "^[A-Z].*")
    private String name;

    @Min(value = 0, message = "Значение не может быть отрицательным")
    private float horsePower;

    @Min(value = 0, message = "Значение не может быть отрицательным")
    private float maxSpeed;

    @Min(value = 0, message = "Значение не может быть отрицательным")
    private float maxDistance;

    @Range(min = 1, max = 6, message = "Количество членов экипажа должно быть от 1 до 6")
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
