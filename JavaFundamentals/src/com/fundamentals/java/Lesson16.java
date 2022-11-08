package com.fundamentals.java;

/*Enumerations*/
public class Lesson16 {
    public enum IceCreamFlavors { VANILLA, CHOCOLATE, STRAWBERRY, ROCK_ROAD };

    public void myFavoriteFlavor(IceCreamFlavors flavor) {
        String msg = "My favorite flavor is ";
        switch(flavor) {
            case VANILLA:
                msg += IceCreamFlavors.VANILLA.toString().toLowerCase();
                break;
            case CHOCOLATE:
                msg += "Chocolate and a little Peanut Butter.";
                break;
            case STRAWBERRY:
                msg += IceCreamFlavors.STRAWBERRY.toString().toLowerCase();
                break;
            case ROCK_ROAD:
                msg += "Rocky Road";
                break;
        }
        System.out.println(msg);
    }
}
