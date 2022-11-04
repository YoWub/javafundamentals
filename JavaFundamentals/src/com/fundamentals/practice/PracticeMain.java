package com.fundamentals.practice;

import com.fundamentals.java.Condo;
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
//        encapsulateBoat();
//        dogRecord();
//        sailBoat();
//        encapsulateGuitar();
//        canoe();
//        polyShapes();
        polyMath();
//        carStuff();
    } // end method

    public static void polyMath() {
        Pentagon pentagon = new Pentagon(15, 15, 15, 15, 15);
        System.out.println(pentagon.getPerimeter());
        System.out.println(pentagon.area());

        Hexagon hexagon = new Hexagon(15);
        System.out.println(hexagon.getPerimeter());
        System.out.println(hexagon.area());

        Parallelogram para = new Parallelogram(15, 30);
        System.out.println(para.area());
        System.out.println(para.getHeight());

        Equilateral eq = new Equilateral(15);
        System.out.println(eq.getPerimeter());
        System.out.println(eq.numberOfSides);
        System.out.println(eq.area());
        System.out.println(eq.getHeight());
    }

    public static void encapsulateGuitar(){
        Guitar guitar1 = new Guitar();
        guitar1.setBoxColor("blue");
        System.out.println(guitar1.getStringCount());
        System.out.println(guitar1.getNeckLength());
        System.out.println(guitar1.getHeadStockShape());

        Guitar guitar2 = new Guitar(10, 5);
//        System.out.println(guitar2.getNeckLength());
        System.out.println(guitar2.getStringCount());

        Guitar guitar3 = new Guitar(10, 20, "Brown", "Curved");
        System.out.println(guitar3.getHeadStockShape());
        System.out.println(guitar3.getNeckLength());
        guitar3.soundQuality();
        guitar3.soundQuality("This guitar sounds groovy and its neck length is");
    }

    public static void acousticGuitar() {
        AcousticGuitar myAcousticGuitar = new AcousticGuitar();
        myAcousticGuitar.setBoxMaterial("Wood");
        myAcousticGuitar.soundQuality(); // from house now overridden
        myAcousticGuitar.echoSound(); // from condo
        System.out.println(myAcousticGuitar.getBridgeCount());
        System.out.println(myAcousticGuitar.getNeckMaterial());
    }

    public static void carStuff() {
        SportsCar theCar = new SportsCar();
        System.out.println(theCar.getHeadLightType());
        System.out.println(theCar.getExteriorColor());

        SportsCar otherSport = new SportsCar("LED Light");
        System.out.println(otherSport.getHeadLightType());
        System.out.println(otherSport.getHorsePower());
        System.out.println(otherSport.getExteriorColor());
//        theCar.carShape();
//        theCar.setExteriorColor("White");
//        theCar.setHorsePower(300);
//        theCar.setWheelSize(17);

        MuscleCar myCar = new MuscleCar(3, 19, 445, "Green", "Round");
        System.out.println(myCar.getExteriorColor());
        System.out.println(myCar.getHorsePower());
//        myCar.carShape(); // parent
        myCar.motion(70); // grand parent
//        myCar.setExteriorColor("Black");
//        myCar.setHorsePower(500);
//        myCar.setWheelSize(20);

        Car myOther = new Car();
//        myOther.carShape(); can not access method from SportsCar
        myOther.motion(55);
    }

    public static void polyShapes() {
        Pentagon pent1 = new Pentagon(10,10,10,10,10);
        double angle = pent1.InteriorAngleCalc();
        System.out.println(angle);

        Hexagon hex1 = new Hexagon(15);
        double angle2 = hex1.InteriorAngleCalc();
        System.out.println(angle2);

        // Upcasting
        Polygon poly1 = new Pentagon(20,20,20,20,20);
        double angle3 = poly1.InteriorAngleCalc();
        System.out.println(angle3);
    }
    public static void canoe() {
        SailingBoat mySailBoat = new SailingBoat();
//        mySailBoat.setNumberOfSeats(5);
        mySailBoat. boomFunction(); // from house
        mySailBoat.comfort(); // from condo
        System.out.println(mySailBoat.getNumberOfSeats());
        System.out.println(mySailBoat.getRudderMaterial());
    }

    public static void sailBoat() {
        SailingBoat mySailBoat = new SailingBoat();
//        mySailBoat.setNumberOfSeats(5);
        mySailBoat. boomFunction(); // from house
        mySailBoat.comfort(); // from condo
        System.out.println(mySailBoat.getNumberOfSeats());
        System.out.println(mySailBoat.getRudderMaterial());
    }
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
        boat1.boomFunction("This boom swings from starboard to port and its stern width is");
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
