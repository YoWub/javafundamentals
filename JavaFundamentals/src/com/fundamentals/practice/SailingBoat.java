package com.fundamentals.practice;

public class SailingBoat extends Boat {
    private int numberOfSeats;

    public SailingBoat() {
        this(400, 500, "Red", "Steel", 10);
    }

    public SailingBoat(int mastLength, int sternWidth, int numberOfSeats) {
        this(400, 500, "White", "Wood", 20);
    }

    public SailingBoat(int mastLength, int sternWidth, String bodyColor, String rudderMaterial, int numberOfSeats) {
        super(mastLength, sternWidth, bodyColor, rudderMaterial);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void comfort() {
        super.boomFunction();
        System.out.println("The sail boat sails smooth");
    }

    @Override
    public void boomFunction() {
        System.out.println("My Sail Boat boom swings slow.");
    }
}
