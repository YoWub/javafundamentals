package com.fundamentals.java;

/*Looping Statement*/
public class Lesson8 {

    //while loop
    public void basicWhileLoop(){
        // initialized value
        int able = 0;

        //condition(expression)
        while (able <= 10) {
            // block of code
            System.out.print(able +" ");
            // increment
            able++;
        } // end while loop
        System.out.println();
    } // end method

    // while loop
    public void basicWhileCountdownLoop(){
        // initialized value
        int beta = 10;

        //condition(expression)
        while (beta >= 0) {
            // block of code
            System.out.print(beta +" ");
            // increment
            beta--;
        } // end while loop
    } // end method

    // do while loop
    public void basicDoWhileLoop(int total){
        // initialized value
        int charlie = 0;

        //condition(expression)
        do  {
            if (charlie % 2 == 0)
            {
                System.out.print(charlie + " ");
            }
            charlie++;
        } while (charlie < total);// end do while loop
        System.out.println();
    } // end method

    // for loop
    public void basicForLoop(int total){
        // initialized value
        for (int i = 0; i< total; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    } // end method

    // for multi loop
    public void multiLoop(int totalA, int totalB){
        for (int i = 0; i< totalA; i++) {
            for (int j = 0; j< totalB; j++) {
                System.out.print(i + "," + j);
            } // end inner loop
        } // end outer loop
    } // end method

    // for string loop
    public void forLoopStringExample(){
        String delta = "Something";
        for (int i = 0; i < delta.length(); i++) {
            System.out.print(delta.charAt(i) + " ");
        } // end loop
    } // end method

    // branch loop
    public void basicBranchExample(){
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 4) {
                break;
            }
            System.out.print(i + " ");
        } // end loop
    } // end method
} // end class
