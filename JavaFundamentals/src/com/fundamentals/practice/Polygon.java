package com.fundamentals.practice;

public abstract class Polygon {

    // many sides
    protected static int DEGREES = 180;
    protected int numberOfSides;

    public Polygon(int sides) {
        this.numberOfSides = sides;
    }

    abstract double area();
    abstract double perimeter();

    protected double InteriorAngleCalc() {
       return  (numberOfSides - 2) * DEGREES;
    }

    protected double exteriorAngle() {
        return DEGREES - InteriorAngleCalc();
    }

}
