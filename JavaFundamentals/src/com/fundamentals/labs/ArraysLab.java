package com.fundamentals.labs;

public class ArraysLab {

    // Method that outputs ice cream flavors
    public void iceCreamFlavorsArray() {
        String[] iceCreamFlavors = {
                "Vanilla", "Chocolate", "Strawberry", "French Vanilla",
                "Butter Pecan", "Cookies N'Cream", "Mint Chocolate Chip",
                "Cookie Dough", "Neapolitan", "Black Cherry", "Raspberry Lemon"
        };

        for (String iceCreamFlavor : iceCreamFlavors) {
            System.out.println(iceCreamFlavor);
        }

        System.out.println();

        };

    // Method that displays home and away team scores for Chiefs' 2019 regular season
    public void homeAndAwayTeamScores() {
        int[][] scoresArray = {
                {40, 26}, {28, 10}, {33, 28}, {34, 30}, {13, 19}, {24, 31},
                {30, 6}, {24, 31}, {26, 23}, {32, 35}, {24, 17}, {40, 9},
                {23, 16}, {23, 3}, {26, 3}, {31, 21}
        };

        for (int[] score : scoresArray) {
                System.out.println("Home: " + score[0] + "," + " Away: " + score[1]);
        }
    }
}
