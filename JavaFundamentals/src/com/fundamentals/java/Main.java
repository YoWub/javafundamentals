/*******************************
  My Project
 ********************************/
package com.fundamentals.java;

import com.fundamentals.labs.*;
import com.fundamentals.practice.ModifierPractice;
import com.fundamentals.practice.MovieGenres;

import java.math.BigDecimal;
import java.util.ArrayList;

// main class
public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello Java\n");

//        houseExample();
//        basicLab();
//        lesson3Example();
//        lesson4Example();
//        modifiersExample();
//        stringsLab();
//        lesson5Example();
//        lesson6Example();
//        lesson7Example();
//        lesson8Example();
//        lesson9Example();
//        lesson10Example();
//        numbersLab();
//        operatorsLab();
//        companyExample();
//        System.out.println("Hello Java!");
//        lesson11Example();
//        conditionalLab();
//        encapsulateHouse();
//        loopingLab();
//        condoInheritance();
//        iceCreamFlavors();
//        collectionsLabAssignment();
//        lesson15Example();
//        televisionLab();
//        lesson16Example();
//        lesson17Example();
        lesson18Example();
    } // end method

    public static void lesson18Example() {
        Lesson18 my18 = new Lesson18();
//        my18.exampleThrows();
//        my18.sampleThrow(2, 0);
//        my18.exampleException();
        my18.myArrayException();
    }
    public static void lesson17Example() {
        Lesson17 seventeen = new Lesson17();
//        seventeen.noLamda();
//        seventeen.withLambda();
//        seventeen.multipleLambda();
//        seventeen.listLambda();
//        seventeen.filterLambda();
//        seventeen.company1000();
//        seventeen.company2000();
        seventeen.queryInfo(Lesson17.getInfo(), (id -> id.getId() >= 2000));
    }

    public static void lesson16Example() {
        //Access enum from class
        Lesson16 lesson16 = new Lesson16();
        Lesson16.IceCreamFlavors ice = Lesson16.IceCreamFlavors.STRAWBERRY;
        System.out.println(ice);
        lesson16.myFavoriteFlavor(Lesson16.IceCreamFlavors.CHOCOLATE);

        // Access enum from file
        Week myDay = Week.MON;
        System.out.println(myDay);
        myDay.someEnumMethod();
        System.out.println(myDay.getDayNum());

        Week[] days = Week.values();
        for(Week day: days) {
            System.out.println("Week number " + day.getDayNum() + " goes with " + day);
        }

        //Access enum from other package
        MovieGenres[] movie = MovieGenres.values();

        for(MovieGenres genres : movie) {
//            System.out.println(genres + " index of " + genres.ordinal());
            System.out.println("This " + genres + " is rated " + genres.getRating() + " for all movies of this genre.");
        }
        System.out.println(MovieGenres.valueOf("HORROR")); // String is case-sensitive to the enum
    }

    public static void televisionLab() {
        Television tv = new Television(20, BigDecimal.valueOf(199.99), 3, true);
        System.out.println(tv.getNumPorts());
        System.out.println(tv.getScreenSize());
        System.out.println(tv.getPrice());
        System.out.println(tv.isMountable());
        tv.turnOn();
    }
    public static void lesson15Example () {
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        HousePhone phone = new HousePhone(5,1,numbers,"LCD");
        phone.receiveCall();
        phone.sendCall();
        System.out.println(phone.getScreen() + HousePhone.HASH);
        phone.endCall();
        phone.callerID("Spam", 5551234);

        // Using the Abstract Class with Up-Casting
        AbstractTelephone myTele = new HousePhone(7, 2, numbers, "No Screen");
        myTele.sendCall();
        System.out.println(myTele);
        myTele.prankCall(new HousePhone(8, 1, numbers, "Haha!"));
        myTele.prankCall(phone);

        // Using the interface with Up-Casting
        PhoneInterface myPhone2 = new HousePhone(4, 0, numbers, "What screen");
        myPhone2.endCall();
        System.out.println(PhoneInterface.HASH);
    }

    public static void collectionsLabAssignment() {
        CollectionsLab myCollectionsLab = new CollectionsLab();
        myCollectionsLab.PizzasArrayList();
        System.out.println(CollectionsLab.intsDivisibleByFiveHashSet(50));
        myCollectionsLab.favoriteBooksHashMap();
    }

    public static void iceCreamFlavors() {
        ArraysLab arraysLab = new ArraysLab();
        arraysLab.iceCreamFlavorsArray();
        arraysLab.homeAndAwayTeamScores();
    }
    public static void condoInheritance() {
        Condo myCondo = new Condo();
//        myCondo.setBalconyType("Small Balcony");
        myCondo.doorFunction(); // from house now overridden
        myCondo.maintenance(); // from condo
        System.out.println(myCondo.getBalconyType());
        System.out.println(myCondo.getDoorColor());
    }

    public static void loopingLab () {
        LoopingLab loopinglab = new LoopingLab();
        loopinglab.whileLoop();
        loopinglab.forLoop();
    }

    public static void encapsulateHouse(){
        House house1 = new House();
        System.out.println(house1.getDoorColor());
        System.out.println(house1.getWindowSize());
        System.out.println(house1.getFoundationType());
        System.out.println(house1.getRoofStyle());

        House house2 = new House("Concrete", "Shingle");
        System.out.println(house2.getDoorColor());
        System.out.println(house2.getWindowSize());

        House house3 = new House("Dirt", "Bamboo", "Tan", 30);
        System.out.println(house3.getFoundationType());
        System.out.println(house3.getRoofStyle());
        house3.doorFunction();
        house3.doorFunction("My door opens and its color is");
    }

    public static void conditionalLab() {
        ConditionalStatementsLab conditionalStatementsLab = new ConditionalStatementsLab();
        conditionalStatementsLab.taskOne("Hey!", "Hello!");
        conditionalStatementsLab.taskTwo('E');
    }

    public static void lesson11Example() {
        System.out.println(Lesson11.fahrenheitToCelsius(56));
        System.out.println(Lesson11.celsiusToFahrenheit(13));
        System.out.println(Lesson11.celsiusToKelvin(30));
        System.out.println(Lesson11.kelvinToCelsius(286.64));
        System.out.println(Lesson11.fahrenheitToKelvin(56));
        System.out.println(Lesson11.kelvinToFahrenheit(355.648));
    }
    public static void companyExample() {
        CompanyInfo info = new CompanyInfo(10101, "Peter Parker");
//        info.id = 101001;
//        info.name = "peter Parker";
        info.display();
        CompanyInfo.company = "Daily Bugle";
        info.display();
    }
    public static void operatorsLab() {
        OperatorsLab operatorslab = new OperatorsLab();
        operatorslab.taskOne();
        operatorslab.taskTwo(2, 3);
        operatorslab.taskThree();
    }

    public static void lesson8Example() {
        Lesson8 lesson8 = new Lesson8();
//        lesson8.basicWhileLoop();
//        lesson8.basicWhileCountdownLoop();
//        lesson8.basicDoWhileLoop(10);
//        lesson8.basicForLoop(20);
//        lesson8.multiLoop(2, 4);
//        lesson8.forLoopStringExample();
        lesson8.basicBranchExample();
    } // end method

    public static void lesson9Example() {
        Lesson9 lesson9 = new Lesson9();
//        lesson9.basicIntArray();
//        lesson9.basicStringArray();
//        lesson9.enhancedForArray();
//        lesson9.basicTwoDimensionalArray();
//        lesson9.enhancedTwoDimensionalArray();
//        lesson9.basicThreeDimensionalArray();
//        lesson9.jaggedArrays();
        lesson9.anotherJaggedArrays();
    } // end method

    public static void lesson10Example() {
        Lesson10 lesson10 = new Lesson10();
//        lesson10.stringArrayList();

        ArrayList<House> houseList = lesson10.myHouseList(5);
//        houseList.get(1).doorColor = "Red";
        for(House house: houseList) {
//            house.doorFunction();
        }

//        lesson10.exampleHashSet();
//        lesson10.exampleHashMap();
        lesson10.linkedList();
        lesson10.queueList();
    } // end method


    public static void lesson7Example() {
        Lesson7 lesson7 = new Lesson7();
//        lesson7.basicIfStatement(2, 3);
//        lesson7.basicIfElseStatement(5, 10);
//        lesson7.mathAndIfIf(5, 20, 12);
//        lesson7.mathAndIfIf2(5, 20, 122);
//        String result = lesson7.basicIfElseChain(15);
//        System.out.println(result);
//        lesson7.basicIfAndExample(20);
//        lesson7.basicIfOrExample(50);
//        lesson7.basicSwitch(4);
//        lesson7.otherSwitch(3);
//        lesson7.anotherSwitch(3);
//        lesson7.stringSwitch("Monday");
//        lesson7.charSwitch('t');
//        String result = lesson7.patternSwitch(3);
//        System.out.println(result);
//        System.out.println(lesson7.patternSwitch(3));
        lesson7.ternaryOperatorExample(1000);
    } // end method

    public static void lesson6Example(){
        Lesson6 lesson6 = new Lesson6();
//        lesson6.basicMath();
//        lesson6.exampleModulus();
//        lesson6.mathOrder();
//        lesson6.addTwoNumbers();
//        lesson6.exampleAssignment();
//        lesson6.relationalEquals(2, 3);
//        lesson6.relationalGreater(5, 5);
//        lesson6.exampleLogicalAnd(7, 7, 10);
//        lesson6.exampleLogicalOr(2, 3, 4);
//        lesson6.exampleLogicalNot(10, 5);
//        lesson6.exampleIncrement();
//        lesson6.exampleDecrement();
    } // end method

    public static void lesson5Example(){
        Lesson5 lesson5 = new Lesson5();
//        lesson5 lesson 5 = new Lesson5();
        lesson5.timePeriodExample();
    } // end method

    public static void lesson3Example() {
        Lesson3 myLesson3 = new Lesson3();
//        myLesson3.exampleString();
//        myLesson3.exampleCharAt();
//        myLesson3.exampleConcat();
//        myLesson3.exampleEquals();
//        myLesson3.exampleLower();
//        myLesson3.exampleUpper();
//        myLesson3.exampleLength();
//        System.out.println(myLesson3.exampleReplace());
//        myLesson3.exampleBuilder("burger", 2);
//        myLesson3.exampleChar();
        myLesson3.exampleEscape();

    } // end method

    public static void lesson4Example() {
        Lesson4 myLesson4 = new Lesson4();
//        myLesson4.numericExample();
//        myLesson4.exponentExample();
//        myLesson4.showLocalExample();
//        myLesson4.exampleImplicit();
        myLesson4.sampleMethods();

    } // end method

    public static void stringsLab() {
        StringsLab myString = new StringsLab();
        myString.takeOne("test");
        myString.takeTwo();
    } // end method

    public static void numbersLab() {
        NumbersLab myNumbersLab = new NumbersLab();
        myNumbersLab.takeOne();
        myNumbersLab.takeTwo();
        myNumbersLab.takeThree();
    } // end method

    public static void basicLab() {

        System.out.println("Hello Java\n");
        BasicStatements myBasicStatements = new BasicStatements();
        myBasicStatements.printStatments();
    } // end method

    /**
     * houseExample method
     */
    public static void houseExample() {
        House myHouse = new House();
        System.out.println(myHouse.getDoorColor());
//        myHouse.doorColor = "Red";
        myHouse.setDoorColor("Red");
        myHouse.doorFunction();


        House otherHouse = new House();
        System.out.println(otherHouse.getDoorColor());
//        otherHouse.doorColor = "Yellow";
        otherHouse.setDoorColor("Yellow");

        House thirdHouse = otherHouse;
        System.out.println(thirdHouse.getDoorColor());
//        thirdHouse.doorColor = "Blue";
        thirdHouse.setDoorColor("Blue");

    }

    /*Modifiers Example*/
    public static void modifiersExample() {
        ModifierPractice practice = new ModifierPractice();
        // practice.examplePrivate(); can not access b/c of private modifier
//        practice.exampleDefault(); can not access b/c of default modifier
//        practice.exampleProtected("Matt"); can not access b/c of protected modifier
        practice.examplePublic();
        System.out.println(practice.isHere);
    } // end method
} // end class
