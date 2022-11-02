package com.fundamentals.labs;

import java.util.*;

// Collections Lab
public class CollectionsLab {

    // Prints count and list of Pizzas
    public void PizzasArrayList(){
        List<String> myPizzaList = new ArrayList<>();//Creating arraylist
        myPizzaList.add("Plain Cheese");//Adding object in arraylist
        myPizzaList.add("Pepperoni");
        myPizzaList.add("Pineapple");
        myPizzaList.add("Buffalo Chicken");
        myPizzaList.add("BBQ Chicken");
        myPizzaList.add("Margherita");
        myPizzaList.add("Mushrooms");
        myPizzaList.add("Ground Beef");
        myPizzaList.add("Cheddar Bacon");
        myPizzaList.add("Vegetarian");

        System.out.println("\nPizza Count: " + myPizzaList.size() + "\n");

        for(String pizza : myPizzaList) {
            System.out.println(pizza);
        }

        System.out.println();
    }

    /* Takes in an int parameter and returns a hash set of those ints divisible by 5,
    that are less than or equal to the param*/
    public static HashSet<Integer> intsDivisibleByFiveHashSet(int param) {
        HashSet<Integer> myHash = new HashSet<>();

        for(int i = 0; i <= param; i++) {
            if (i % 5 == 0) {
                myHash.add(i);
            }
        }
        return myHash;
    }

    // Lists favorite books by their respective ISBN
    public void favoriteBooksHashMap() {

        HashMap<String, String> favoriteBooksMap = new HashMap<>();

        favoriteBooksMap.put("978-1-565-63977-5", "The Interlinear Bible");
        favoriteBooksMap.put("978-0-425-27618-1", "The Elements Of Eloquence");
        favoriteBooksMap.put("0-674-01572", "The Mystery of Economic Growth");
        favoriteBooksMap.put("1-57230-489-8", "Theories Of Development");
        favoriteBooksMap.put("978-0-452-01071-0", "Strategy");
        favoriteBooksMap.put("978-1-4654-2979-7", "How Business Works");
        favoriteBooksMap.put("978-0-06-222667-9","Winning Arguments");
        favoriteBooksMap.put("978-1-4351-6009-5","50 Strategies That Changed History");
        favoriteBooksMap.put("978-0-9826018-3-9","Rhythm of a Captured Heart");
        favoriteBooksMap.put("978-1-4262-1677-0","Concise History of Science & Invention");

        System.out.println();

        System.out.println("Favorite Books: " + "\n");

        for(Map.Entry<String, String> book : favoriteBooksMap.entrySet()) {
            System.out.println(book.getKey() + "     " + book.getValue());
        }
    }

}
