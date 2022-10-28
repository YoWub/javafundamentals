package com.fundamentals.practice;

import com.fundamentals.java.House;
import com.fundamentals.java.Lesson4;
import com.fundamentals.labs.OperatorsLab;

import  java.util.Arrays;

import java.lang.reflect.Array;

public class PracticeMain {

    public static void main(String[] args){
//        modifiers();
//        lessonsReference();
//        exampleVarArgs();
//        singleVarArg();
//        lesson6practice();
//        lesson8practice();
//        beer();
        encapsulateBoat();
        dogRecord();
    } // end method

    public static void dogRecord() {
        Dog myDog = new Dog(3, "lab", 8);

        System.out.println(myDog.breed());
        myDog.move();
    }

    public static void encapsulateBoat(){

        Boat boat1 = new Boat(450, 300, "Brown", "Rubber");

        Boat boat2 = new Boat(450, 300, "Silver", "Steel");

        Boat boat3 = new Boat(450, 300, "White", "Wood");

        System.out.println(boat1.getMastLength());
        System.out.println(boat2.getRudderMaterial());
        System.out.println(boat3.getBodyColor());


        Boat boat4 = new Boat();
        System.out.println(boat4.getMastLength());
        System.out.println(boat4.getRudderMaterial());
        System.out.println(boat4.getBodyColor());

        Boat boat5 = new Boat(450, 300);
        System.out.println(boat5.getMastLength());
        System.out.println(boat5.getRudderMaterial());
        System.out.println(boat5.getBodyColor());

        Boat boat6 = new Boat(500, 400, "Tan", "Plastic");
        System.out.println(boat6.getMastLength());
        System.out.println(boat6.getRudderMaterial());
        System.out.println(boat6.getBodyColor());

        boat1.boomFunction();
    }

//    public static void serializationExample() {
//    }

    public static void lesson8practice(){
        LoopingPractice loopingPractice = new LoopingPractice();
        loopingPractice.loopFiveThree();
//        operatorsPractice.addTwoNumbers();
//        operatorsPractice.exampleAssignment();
//        operatorsPractice.exampleIncrement();
//        operatorsPractice.exampleDecrement();
//        operatorsPractice.exampleLogicalAnd();
    }

    public static void lesson6practice(){
        OperatorsPractice operatorsPractice = new OperatorsPractice();
//        operatorsPractice.mathOrder();
//        operatorsPractice.mathStuff();
//        operatorsPractice.bigDecimal();
//        operatorsPractice.addTwoNumbers();
//        operatorsPractice.exampleAssignment();
//        operatorsPractice.exampleIncrement();
//        operatorsPractice.exampleDecrement();
//        operatorsPractice.exampleLogicalAnd();
    }

    public static void modifiers(){
        ModifierPractice practice =  new ModifierPractice();
        practice.exampleDefault();
        System.out.println(practice.message);

        practice.exampleProtected("Matt");
        System.out.println(practice.letter);
    } // end method

    public static void lessonsReference(){
        Lesson4 lesson4 = new Lesson4();
        lesson4.sampleMethods();
    } // end method

    public static void beer() {
        BottlesOfBeer beer = new BottlesOfBeer();
        beer.beerSong();
    }

    public static void exampleVarArgs(){
        singleVarArg("Happy", "Thursday", "Weekend");
        singleVarArg("Try me");
        singleVarArg();
    } // end method

    public static void singleVarArg(String... value){
        System.out.println(Arrays.toString(value));
        for(String s : value){
            System.out.println(s);
        }
//        System.out.println(value[1]); can't use b/c if one argument gets passed, we get am out of bounds error
    } // end method

//    public static void boatExample() {
//        Boat myBoat = new Boat();
//        System.out.println(myBoat.getMastLength());
//        myBoat.setRudderMaterial("Rubber");
//        myBoat.setBodyColor("Beige");
//
//
//        Boat otherBoat = new Boat();
//        System.out.println(otherBoat.getRudderMaterial());
//        otherBoat.setSternWidth(200);
//
//        Boat thridBoat = otherBoat;
//        System.out.println(thridBoat.getMastLength());
//        thridBoat.setMastLength(400);
//
//    }
} // end class
