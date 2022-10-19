package com.fundamentals.labs;

public class NumbersLab {
    byte myByte = 1;
    short myShort = 50;
    int myInt = 100;
    double myDouble = 10.5;
    float myFloat = 110.0f;
    long myLong = 300L;

    // print binary, hexadecimal and octal values for the decimal number 29.
    public void takeOne() {
        int binaryValue = 11101;
        int hexadecimalValue = 0x1d;
        int octalValue = 35;

        System.out.println("Binary " + binaryValue);
        System.out.println("Hexadecimal " + hexadecimalValue);
        System.out.println("Octal " + octalValue);
    }

    //
    public void takeTwo() {
        int myByteToInt = myByte;
        long myShortToLong = myShort;
        float myIntToFloat = myInt;

        System.out.println("byte to int " + myByteToInt);
        System.out.println("short to long " + myShortToLong);
        System.out.println("int to float " + myIntToFloat);
    }

    //
    public void takeThree(){

        long myDoubleToLong = (long)myDouble;
        int myFloatToInt = (int)myFloat;
        short myLongToShort = (short) myLong;

        System.out.println("double to long " + myDoubleToLong);
        System.out.println("float to int " + myFloatToInt);
        System.out.println("long to short " + myLongToShort);
    }

}
