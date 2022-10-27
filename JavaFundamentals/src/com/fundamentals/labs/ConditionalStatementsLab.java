package com.fundamentals.labs;

public class ConditionalStatementsLab {

    public void taskOne(String param_1, String param_2) {
        
        System.out.println("\nSolution to Task 1:\n");

        if (param_1 == param_2)
            System.out.println(param_1 + " is equal to " + param_2);
        else
            System.out.println(param_1 + " is not equal to " + param_2 + "\n");
    }

    public void taskTwo(char grade) {

        System.out.println("\nSolution to Task 2:\n");

        switch (Character.toUpperCase(grade)) {
            case 'E':
                System.out.println("Excellent Grade");
                break;
            case 'V':
                System.out.println("Very Good Grade");
                break;
            case 'G':
                System.out.println("Good Grade");
                break;
            case 'A':
                System.out.println("Average Grade");
                break;
            case 'F':
                System.out.println("TFailed Grade");
                break;
            default:
                System.out.println("Not a valid grade");
        }
    }
}
