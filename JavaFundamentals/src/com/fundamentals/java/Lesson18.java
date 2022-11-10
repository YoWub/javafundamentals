package com.fundamentals.java;

public class Lesson18 {
    House ranch;

    public void exampleThrows() throws NullPointerException {
        System.out.println(ranch.getWindowSize());
    }

    public void sampleThrow( int value1, int value2) {
        if(value2 !=0) {
            System.out.println(value1 / value2);
        } else {
            throw new ArithmeticException("Can't Divide by zero");
        }
    }

    public void exampleException() {
        try {
            System.out.println(ranch.getWindowSize());
        } catch (NullPointerException ex) {
            System.out.println("A Null pointer exception was called " + ex.getMessage());
        } finally {
            System.out.println("The finally block was called");
        }
    }

    public void myArrayException() {
        String[] names = {"David", "Jody", "Kate"};
        String[] values = {"243", "127", "542"};

        try {
            byte b = Byte.parseByte(values[-500]);
            System.out.println(b);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Please provide at least one argument ");
        } catch(NumberFormatException ed) {
            System.out.println("That is not a parsable number");
        } catch (StackOverflowError e) {
            System.out.println("You have given me more than a byte.");
        } catch(Exception ea) {
            System.out.println("dunno what you did " + ea.getMessage());
        }
    }
}
