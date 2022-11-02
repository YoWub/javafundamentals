package com.fundamentals.practice;

public class Guitar {
    private int stringCount;
    private int neckLength;
    private String boxColor;
    private String headStockShape;

//    public Boat() {
//        System.out.println("Default Constructor");
//    }

    public Guitar() {
        this(400, 350, "White", "Steel");
    }

    public Guitar(int stringCount, int neckLength) {
        this(stringCount, neckLength, "Red", "Oval");
    }

    public Guitar(int stringCount, int neckLength, String boxColor, String headStockShape) {
        this.stringCount = stringCount;
        this.neckLength = neckLength;
        this.boxColor = boxColor;
        this.headStockShape= headStockShape;
    }

    /*Setter and Getter*/

    public void setStringCount(int stringCount) {
        this.stringCount = stringCount;
    }

    public void setBoxColor(String boxColor) {
        this.boxColor = boxColor;
    }

    public int getStringCount() {
        return stringCount;
    }

    public int getNeckLength() {
        return neckLength;
    }

    public void setNeckLength(int neckLength) {
        this.neckLength = neckLength;
    }

    public String getBoxColor() {
        return boxColor;
    }

    public String getHeadStockShape() {
        return headStockShape;
    }

    public void setHeadStockShape(String headStockShape) {
        this.headStockShape = headStockShape;
    }

    public void soundQuality() {
        System.out.println("This guitar sounds groovy.");
    }

    public void soundQuality(String message) {
        System.out.println(message + " " + neckLength);
    }
}
