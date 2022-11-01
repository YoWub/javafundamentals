package com.fundamentals.practice;

public class Polygon {
    // many sides
    protected static int DEGREES = 180;
    protected int numberOfSides;

    public Polygon() {
        this(3);
    }
    public Polygon(int sides) {
        this.numberOfSides = sides;
    }

    protected double InteriorAngleCalc() {
       return  (numberOfSides - 2) * DEGREES;
    }

    protected double exteriorAngle() {
        return DEGREES - InteriorAngleCalc();
    }
    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }
}
