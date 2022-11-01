package com.fundamentals.java;

public class Condo extends House {
    private String balconyType;


    public String getBalconyType() {
        return balconyType;
    }

    public void setBalconyType(String balconyType) {
        this.balconyType = balconyType;
    }


    public void maintenance() {
        System.out.println("We'll fix any issues!");
    }
}
