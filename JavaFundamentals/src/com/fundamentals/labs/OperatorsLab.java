package com.fundamentals.labs;

import java.util.Scanner;

public class OperatorsLab {
    public void taskOne() {
        int variable_1 = 10 + 32 * 12 / 3;
        int variable_2 = (10 + 32) * 12 / 3;

        System.out.println("Solution to Task 1:");
        System.out.println(variable_1);
        System.out.println(variable_2);
        System.out.println();
    }

    public void taskTwo(int param_1, int param_2) {

        System.out.println("Solution to Task 2:");
        System.out.println(param_1 += param_2);
        System.out.println(param_1 *= param_2);
        System.out.println(param_1 %= param_2);
        System.out.println();
    }

    public void taskThree() {

        System.out.println("Solution to Task 3:");
        System.out.println("Enter an integer below to calculate its modulus(remainder) value when divided by 5:\n");
        Scanner in = new Scanner(System.in);

        int modulus_variable = 5, entered_number, result;

        entered_number  = in.nextInt();
        result = entered_number % modulus_variable;

        System.out.println("\nThe modulus(remainder) of " + entered_number + " when divided by "
                + modulus_variable + " is:\n\n" + result);
    }
}
