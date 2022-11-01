package com.fundamentals.practice;

public class SailingBoat extends Boat {
    private String numberOfSeats;


    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(String numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void comfort() {
        System.out.println("The sail boat sails smooth");
    }
}
