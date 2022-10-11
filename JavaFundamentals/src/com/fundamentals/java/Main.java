/*******************************
  My Project
 ********************************/
package com.fundamentals.java;

// main class
public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello Java\n");

//        houseExample();
        basicLab();
    } // end method

    public static void basicLab() {
        System.out.println("Hello Java\n");
    }
    /**
     * houseExample method
     */
    public static void houseExample() {
        House myHouse = new House();
        myHouse.doorColor = "Red";
        myHouse.doorFunction();

        House otherHouse = new House();
        otherHouse.doorColor = "Yellow";
        otherHouse.doorFunction();

        House thirdHouse = otherHouse;
        thirdHouse.doorColor = "Blue";

        System.out.println(myHouse.doorColor);
        System.out.println(otherHouse.doorColor);
        System.out.println(thirdHouse.doorColor);
    }
} // end class
