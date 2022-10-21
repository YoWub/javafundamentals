package com.fundamentals.practice;

public class LoopingPractice {
    //while loop to display divisible by 5
    public void basicHundredLoop(){
        // initialized value
        int able = 0;
        //condition(expression)
        while (able <= 100) {
            if (able % 5 == 0){
                System.out.print(able + " ");
            }
            able++;
        } // end while loop
    } // end method

    //Display prime numbers
    public void loopFiveThree(){
        System.out.println();
        int counter;
        for (int i = 0; i <= 100; i++) {
            counter = 0;
            for (int j = 1; j <= 100; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if(counter == 2) {
                System.out.print(i + " ");
            }
        } // end while loop
    } // end method
}
