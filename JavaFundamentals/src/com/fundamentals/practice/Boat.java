package com.fundamentals.practice;

public class Boat {
    private int mastLength;
    private int sternWidth;
    private String bodyColor;
    private String rudderMaterial;

//    public Boat() {
//        System.out.println("Default Constructor");
//    }

    public Boat() {
        this(400, 350, "White", "Steel");
    }

    public Boat(int mastLength, int sternWidth) {
        this(mastLength, sternWidth, "Red", "Steel");
    }

    public Boat(int mastLength, int sternWidth, String bodyColor, String rudderMaterial) {
        this.mastLength = mastLength;
        this.sternWidth = sternWidth;
        this.bodyColor = bodyColor;
        this.rudderMaterial= rudderMaterial;
    }

    /*Setter and Getter*/

    public void setMastLength(int mastLength) {
        this.mastLength = mastLength;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public int getMastLength() {
        return mastLength;
    }

    public int getSternWidth() {
        return sternWidth;
    }

    public void setSternWidth(int sternWidth) {
        this.sternWidth = sternWidth;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public String getRudderMaterial() {
        return rudderMaterial;
    }

    public void setRudderMaterial(String rudderMaterial) {
        this.rudderMaterial = rudderMaterial;
    }

    public void boomFunction() {
        System.out.println("This boom swings from starboard to port .");
    }

    public void boomFunction(String message) {
        System.out.println(message + " " + sternWidth);
    }
}
