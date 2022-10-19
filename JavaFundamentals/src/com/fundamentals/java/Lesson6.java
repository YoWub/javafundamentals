package com.fundamentals.java;

import java.util.Scanner;

public class Lesson6 {

    int value1 = 23, value2 = 45;

    public void basicMath(){
        System.out.println(value1+value2);
        System.out.println(value2-value1);
        System.out.println(value1*value2);
        System.out.println(value2/value1);
    } // end method

    public void exampleModulus(){
        int modulusTotal = value2 % value1;
        System.out.println(modulusTotal);
    } // end method

    public void mathOrder(){
        int total = 10 / (3 + 2) * 4 + 5 * 10 + 6 - 9;
        System.out.println(total);
    } // end method

    public void addTwoNumbers(){
        int sum1, sum2, total;
        System.out.println("Enter integers to calculate their sum:\n");
        Scanner in = new Scanner(System.in);
//        sum1 = Integer.parseInt(in.next());
//        sum2 = Integer.parseInt(in.next());
        sum1 = in.nextInt();
        sum2 = in.nextInt();
        total = sum1 + sum2;
        System.out.println("The total of the problem is " + total);
    } // end method

    public void exampleAssignment(){
        int able = 10, may = 15;
        able += may;
        System.out.println(able);
        may -= able;
        System.out.println(may);
        able *= may;
        System.out.println(able);
        able /= may;
        System.out.println(able);
        able %= may;
        System.out.println(able);
    } // end method

    public void relationalEquals(int echo, int foxtrot){
        boolean isSample1 = echo == foxtrot;
        boolean isSample2 = echo != foxtrot;

        System.out.println(isSample1);
        System.out.println(isSample2);
    } // end method

    public void relationalGreater(int golf, int hotel){
        boolean isActual = golf > hotel;
        boolean isActual2 = hotel <= golf;

        System.out.println(isActual);
        System.out.println(isActual2);
    } // end method

    /*Logical operators && (and) means that both conditions must be true.
    * If the first one is false, the second one is not checked.*/
    public void exampleLogicalAnd(int value, int value2, int value3){
        boolean logic = value != value2 && value3 > value2;

        System.out.println(logic);
    } // end method

    /*Logical operators || (or) means that only one of the conditions must be true.
     * If the first one is true, the second one is not checked.*/
    public void exampleLogicalOr(int value, int value2, int value3){
        boolean logic = value != value2 || value3 > value2;

        System.out.println(logic);
    } // end method

    public void exampleLogicalNot(int value, int value2){
        boolean answer = !(value > value2);
        System.out.println(answer);
    } // end method

    public void exampleIncrement(){
        int home = 10, jump, car;

        jump = home ++;
        System.out.println(jump);

        car = ++home;
        System.out.println(car);
    } // end method

    public void exampleDecrement(){
        int tom = 10, joe, jerry;

        joe = tom--;
        System.out.println(joe);

        jerry = --tom;
        System.out.println(jerry);
    } // end method

} // end class
