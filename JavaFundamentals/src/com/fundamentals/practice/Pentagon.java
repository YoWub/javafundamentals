package com.fundamentals.practice;

public class Pentagon extends Polygon{

    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;
    private double sideE;

    public Pentagon(double sideA, double sideB, double sideC, double sideD, double sideE) {
        super(5);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.sideE = sideE;
    }

    public Pentagon() {
        super(5);
    }

    @Override
    double area() {
        double value = 5 * (5 + 2*Math.sqrt(5))*Math.pow(numberOfSides, 2);
        return 0.25 * Math.sqrt(value);
    }

    @Override
    double perimeter() {
        return sideA + sideB + sideC + sideD + sideE;
    }
}
