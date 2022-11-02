package com.fundamentals.practice;

public class MuscleCar extends SportsCar {

    public MuscleCar() {
        this(2, 22, 550, "Black", "Halogen");
    }

    public MuscleCar(int numberOfDoors, int wheelSize, int horsepower, String exteriorColor, String headLightType) {
        super(numberOfDoors, wheelSize, horsepower, exteriorColor, headLightType);
    }

}
