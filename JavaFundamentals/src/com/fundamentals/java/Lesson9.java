package com.fundamentals.java;

/*Arrays*/
public class Lesson9 {

    //Array of int values
    public void basicIntArray(){
        int[] intArray = {23, 45, 12, 8, 92, 103, 37};

        for(int i = 0; i< intArray.length; i++) {
            System.out.println(intArray[i]);
        } // end loop
    } // end method

    // an array of strings
    public void basicStringArray() {
        String[] stringArray = new String[4];
        stringArray[0] = "Happy";
        stringArray[1] = "Monday";
        stringArray[2] = "Movie";
        stringArray[3] = "Day";

        for(int i=0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        } // end loop
    } // end method

    // enhanced for Array
    public void enhancedForArray() {
        int[] intArray = {23, 45, 12, 8, 92, 103, 37};

        for(int number : intArray) {
            System.out.println(number);
        } // end loop
    } // end method

    // Two Dimensional Array
    public void basicTwoDimensionalArray() {
        int[][] myArray = {{23, 45}, {35, 46}, {57, 98}, {32, 48}};

        for(int i=0; i < myArray.length; i++) {
            for(int j=0; j < myArray[i].length; j++) {
                System.out.println("["+i+"]"+"["+j+"] = " + myArray[i][j] + ", ");
            } // end inner loop
        } // end outer loop

        System.out.println();
    } // end method

    // Two Dimensional Array
    public void enhancedTwoDimensionalArray() {
        int[][] myArray = {{23, 45}, {35, 46}, {57, 98}, {32, 48}};

        for (int[] ints : myArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " , ");
            } // end inner loop
        } // end outer loop
    } // end method

    // Three Dimensional Array
    public void basicThreeDimensionalArray() {
        int[][][] intArray = {{{23, 25}, {45, 20}},{{35, 46}, {10, 20}}};

        for(int [][] ints: intArray) {
            for(int j=0; j < ints.length; j++) {
                for (int k=0; k < intArray[j].length; k++) {
                    System.out.println(ints[j][k]);
                } // end inner inner loop
            } // end inner loop
        } // end outer loop
        System.out.println();
    } // end method

    // Jagged Arrays
    public void jaggedArrays() {
        int[][] intArray = new int [1][3];

        intArray[0][0] = 25;
        intArray[0][1] = 35;
        intArray[0][2] = 45;

        for (int[] ints : intArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " , ");
            } // end inner loop
        } // end outer loop
    } // end method

    // Jagged Arrays
    public void anotherJaggedArrays() {
        int[][] strArray = new int [1][3];
//         int[][] strArray = {{25,35,45}};

        strArray[0][0] = 25;
        strArray[0][1] = 35;
        strArray[0][2] = 45;

        for (int[] ints : strArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " , ");
            } // end inner loop
        } // end outer loop
    } // end method
} // end class
