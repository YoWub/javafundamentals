package com.fundamentals.practice;

public class Isosceles extends Triangle{

    public Isosceles(double side2, double side1) {
        this.sideA = side2;
        this.sideB = side2;
        this.sideC = side1;
    }

    @Override
    public double getHeight() {
        return 0;
    }
}
