package com.fundamentals.labs;

import java.math.BigDecimal;

public class Television {

    private double screenSize;
    private BigDecimal price;
    private int numPorts;
    private boolean isMountable;

    public Television(double screenSize, BigDecimal price) {
        this(screenSize, price, 1, false);
    }

    public Television(double screenSize, BigDecimal price, int numPorts, boolean isMountable) {
        this.screenSize = screenSize;
        this.price = price;
        this.numPorts = numPorts;
        this.isMountable = isMountable;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getNumPorts() {
        return numPorts;
    }

    public void setNumPorts(int numPorts) {
        this.numPorts = numPorts;
    }

    public boolean isMountable() {
        return isMountable;
    }

    public void setMountable(boolean mountable) {
        isMountable = mountable;
    }

    public void turnOn() {
        System.out.println("The " + screenSize + " TV is On");
    }
}
