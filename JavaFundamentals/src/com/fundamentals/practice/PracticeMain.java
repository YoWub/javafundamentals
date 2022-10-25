package com.fundamentals.practice;

import com.fundamentals.java.Lesson4;

import  java.util.Arrays;

import java.lang.reflect.Array;

public class PracticeMain {

    public static void main(String[] args){
//        modifiers();
//        lessonsReference();
//        exampleVarArgs();
//        singleVarArg();
        lesson6practice();
//        lesson8practice();
//        beer();
    } // end method

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
} // end class
