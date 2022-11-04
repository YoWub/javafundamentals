package com.fundamentals.practice;

public class Parallelogram extends Quadrilaterals{

    public Parallelogram(double length, double width) {
        this.setLengthA(length);
        this.setLengthB(length);
        this.setLengthC(width);
        this.setLengthD(width);
    }

    @Override
    protected double area() {
        // TODO base * height
        // A = a b sin A = b a sin B
        // A = 45 B = 135
        return getLengthA() * getLengthC() * Math.sin(45);
    }

    protected double getHeight() {
        return area()/getLengthC();
    }

    @Override
    protected double getPerimeter() {
        return 2 * (getLengthA() + getLengthC());
    }
}
