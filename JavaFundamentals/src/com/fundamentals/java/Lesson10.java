package com.fundamentals.java;

import java.util.*;

public class Lesson10 {
    public void stringArrayList(){
        List<String> myList = new ArrayList<>();//Creating arraylist
        myList.add("Happy");//Adding object in arraylist
        myList.add("Tuesday");
        myList.add("Not Monday");
        myList.add("Where's Friday?");

        System.out.println(myList.get(2));
        System.out.println(myList.contains("Not Monday"));
        System.out.println(myList.size());

        for(String day : myList) {
            System.out.println(day);
            if(day.contains("day")) {
                System.out.println(day);
            }
        }

        System.out.println(myList);
    }

    public ArrayList<House> myHouseList(int count){
        ArrayList<House> houses = new ArrayList<>();
        for(int i= 0; i< count; i++) {
            houses.add(i, new House());
        }
        return houses;
    }

    /*Hash Set*/
    public void exampleHashSet() {
        HashSet<String> myHash = new HashSet<>();
        myHash.add("Firecrackers");
        myHash.add("Sparklers");
        myHash.add("Fountains");
        myHash.add("Quarter Sticks");
        myHash.add("Smoke Bombs");
        myHash.add("Mortars");

        Iterator<String> init = myHash.iterator();
        while (init.hasNext()) {
            System.out.println(init.next());
        }

        System.out.println();
        for(String fun : myHash) {
            System.out.print(fun + ", ");
        }

        System.out.println(myHash);
    }

    /*Hash Map*/
    public void exampleHashMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(10, "Happy");
        myMap.put(1,"Days");  //Put elements in Map
        myMap.put(2,"Are");
        myMap.put(3,"Here");
        myMap.put(4,"!");

        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");

        for(Map.Entry<Integer, String> beta : myMap.entrySet()) {
            System.out.println(beta.getKey() + "-" + beta.getValue());
        }
        System.out.println("Iterating HashMap...");
        for(Map.Entry m : myMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.print(myMap);

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.print(map);
    }

    /*Linked List*/
    public void linkedList(){
        LinkedList<String> al=new LinkedList<String>();
        al.add("BMW");
        al.add("Mercedes");
        al.add("Nissan");
        al.add("Volkswagen");

        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();
    }

    /*Linked List*/
    public void queueList(){
        LinkedList<String> myLinkedQueue =new LinkedList<>();
        myLinkedQueue.add("Pasta");
        myLinkedQueue.add("Alfredo");
        myLinkedQueue.add("Spaghetti");
        myLinkedQueue.add("Macaroni");
        myLinkedQueue.add("Linguini");
        myLinkedQueue.add("Egg Noodles");

        String something = myLinkedQueue.peek();
        String other = myLinkedQueue.poll();

        System.out.println("This keeps "+ something + " and this removes " + other);

        Iterator<String> myPasta = myLinkedQueue.iterator();
        while(myPasta.hasNext()) {
            System.out.println(myPasta.next());
        }
        System.out.println();

        for(String food : myLinkedQueue) {
            System.out.println(food);
        }
    }
}
