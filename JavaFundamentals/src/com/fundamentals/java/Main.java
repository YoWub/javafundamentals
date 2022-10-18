/*******************************
  My Project
 ********************************/
package com.fundamentals.java;

import com.fundamentals.labs.BasicStatements;
import com.fundamentals.practice.ModifierPractice;

// main class
public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello Java\n");

//        houseExample();
//        basicLab();
//        lesson3Example();
//        lesson4Example();
//        modifiersExample();
//        stringLab();
        lesson5Example();
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

    public static void stringLab() {
//        StringsLab myStrings = new StringsLab();
//        myStrings.printStatements();
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
