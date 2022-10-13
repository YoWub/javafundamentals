package com.fundamentals.java;

/*Primitive Data Types
* Primitive Data Types don't share states like objects*/
public class Lesson4 {

    /* This primitive type has a value range of
     * -128 to 127 */
    byte myByte = 9;

    /*
    * This primitive type has a value range of
    * -32768 to 32767 */
    short myShort = 235;

    /*
     * This primitive type has a value range of
     * -2,147,438,648 to 2,147,483,647 */
    int myInt = 2354;

    /*
     * This primitive type has a value range of
     * -9,223,372,036,854,774,808 to 9,223,372,036,854,775,807 */
    long myLong = 56864L;

    /*
     * This primitive type has a value range of
     * 3.4E-38 x 1038 to 3.4E+38 */
    float myFloat = 34.53f;

    /*
     * This primitive type has a value range of
     * 1.7E-308, 1.7E+308 */
    double myDouble = 84.98d;
    double myOther = 36.43;

    /* Numeric Systems */

    // Decimal value of 26
    int myDecimal = 26;

    // Hexadecimal value of 26
    int myHexadecimal = 0x1A;

    // Binary value of 26
    int myBinary = 0b11010;

    // Octal value of 26
    int myOctal= 032;

    public void numericExample() {
        System.out.println("Decimal "+myDecimal);
        System.out.println("Hexadecimal "+ myHexadecimal);
        System.out.println("Binary "+myBinary);
        System.out.println("Octal "+myOctal);
    } // end method

    // Scientific Notation
    double myExponent = 23.65E8;  // 2,365,000,000
    double myOtherExponent = 10E-3; // .010

    // Using underscores to make the number readable
    long usingUnderscores = 4568987367L;

    public void exponentExample() {
        System.out.println(usingUnderscores);
    } // end method

    // static variables
    static int something = 100;

    // Instance variable - class level scope
    int able = 100;

    // This method shows local scope - method level
    public void showLocalExample() {
        // The local scope overrides class level
        int able = 20;
        System.out.println(able);
    } // end method


    int myInt2 = 100;
    long value = 2345_3439_3434L;
    double value2 = 123.45;

    /*Data type Conversion is the concept of converting between different
    * primitive data types. When going from a floating point to an integer,
    * there is no rounding. The value is truncated.*/

    /*Implicit or Widening data type conversion is done when two data types
    * automatically convert */
    public void exampleImplicit() {
        long sample = myInt2;
        float myFloat = value;
        System.out.println("My sample is "+sample);
        System.out.println("My Float is "+myFloat);
    } // end method

    /* Explicit or Narrowing data type conversion is done when two data types
     * convert, but require direct boxing effect. This is because
     * a larger data type is converting to a smaller one, which will
     * have precision loss. */
    public void exampleExplicit() {
        long sample2 = (long)value2;
        int sample3 = (int)value;
        System.out.println("My sample2 is "+sample2);
        System.out.println("My sample3 is "+sample3);
    } // end method

    /* Sample Methods
    * */
    public void sampleMethods() {
        int able = 5;;

        int something = Integer.parseInt("32");
        int max = Integer.MAX_VALUE;
        byte bmax = Byte.MIN_VALUE;
        short smax = Short.MAX_VALUE;
        long lmax = Long.MAX_VALUE;
        float fmax = Float.MAX_VALUE;
        double dmax = Double.MIN_VALUE;
        System.out.println(something);
    } // end method

} // end class
