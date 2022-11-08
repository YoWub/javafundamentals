package com.fundamentals.practice;

public class Isosceles extends Triangle{

    public Isosceles(double side2, double side1) {
        this.sideA = side2;
        this.sideB = side2;
        this.sideC = side1;
    }

    @Override
    public double getHeight() {
        return Math.sqrt(Math.pow(sideB, 2) - Math.pow((sideC / 2), 2) );
    }

    @Override
    protected double area() {
        System.out.println(super.area());
        return 0.5 * sideC * getHeight();
    }
}
