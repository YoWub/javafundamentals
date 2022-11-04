package com.fundamentals.practice;

public class Hexagon extends Polygon{
    private double sideA;

    public Hexagon(int sideLength) {
        super(6);
        this.sideA = sideLength;
    }

    @Override
    protected double area() {
        System.out.println(super.area());
        return 3 * Math.sqrt(3)/2 * Math.pow(sideA, 2);
    }

    @Override
    protected double getPerimeter() {
        return sideA * numberOfSides;
    }
}
