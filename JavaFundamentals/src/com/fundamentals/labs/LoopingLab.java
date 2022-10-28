package com.fundamentals.labs;

public class LoopingLab {

    public void whileLoop() {
        int i = 0;

        while (i <= 15) {
            if (i == 5) {
                System.out.println("Five");
            }
            else if (i == 10) {
                System.out.println("Ten");
            } else if (i == 15) {
                System.out.println("Fifteen");
            }
            else
            {
                System.out.println(i);
            }
            i++;
        }
        System.out.println();
    }

    public void forLoop() {

        for (int i = 0; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}