package com.fundamentals.java;

/****
 * All about Strings:
 * Strings are objects which makes them immutable.
 * Immutable means that once a string object is created,
 * its data and state cannot be changed. A new object will
 * be created instead.
 */
public class Lesson3 {

    // String class fields (attributes)
    String myString = "LaMars";
    String myOther = "LaMars";
    String javaNote = "Java is a programming language. Java is everywhere.";

    /* Both strings above point to the same reference in the memory heap
     *instead of being two different objects */

    String sampleString = new String("LaMars");

    public void exampleString(){
        // Assign a new reference to the method variable
        String beta = myString;

        // A new string object is created to combine these below.
        myString = myString + " Donuts";

        System.out.println(myString);
        System.out.println(beta);
    } // end method

    /*
     * String methods that can be accessed through the reference variable
     */

    /*
     * The charAt method returns the char value based on the index position
     */

    public void exampleCharAt(){
        char myChar = javaNote.charAt(3);
        char example2 = javaNote.charAt(4);
        char example3 = javaNote.charAt(5);
        System.out.println("First " + myChar);
        System.out.println("Second " + example2);
        System.out.println("Third " + example3);
    } // end method

    /* The concat method joins two strings together based on Concatenation */
    public void exampleConcat() {
        String myDonut = myString.concat(" Donut");
        System.out.println(myDonut);
    } // end method

    /* The equals method compares a string to a specified object */
    public void exampleEquals() {
        boolean myBool = myString.equals("LaMars");
        System.out.println(myBool);

        boolean otherBool = myString.equals(sampleString);
        System.out.println(otherBool);

        // TODO: will come back to this
//        boolean thirdBool = (myString == sampleString);
//        System.out.println(thirdBool);
    } // end method

    /* The toLower and toUpper will change the whole string to
     either upper and lower case*/
    public void exampleLower() {
        String able = javaNote.toLowerCase();
        System.out.println(able);
    } // end method

    /* The toLower and toUpper will change the whole string to
     either upper and lower case*/
    public void exampleUpper() {
        String beta = javaNote.toUpperCase();
        System.out.println(beta);
    } // end method

    /* The length method will return the size of the string.
    including any empty spaces*/
    public void exampleLength() {
        System.out.println(javaNote.length());
    } // end method

    /* The replace method will replace all instances of a set of characters.
    including any empty spaces*/
    public String exampleReplace() {
        return javaNote.replace("Java", "Lava");
    } // end method

    /* String builder allows you to join objects or primitives
    * together into a kind of list, which you can change
    * back to a string object using the two string method*/
    public void exampleBuilder(String food, int quantity) {
        StringBuilder builder = new StringBuilder();
        builder.append("My favorite food is ");
        builder.append(food).append(" and I ate ")
                .append(quantity).append(" plates of it.");
        String fav = builder.toString();
        System.out.println(fav);
    } // end method

    /* A char is a single character primitive data type */
    public void exampleChar() {
        char letter  = 't';
        char uniCharacter = '\u00A9';
        String test = "something" + uniCharacter;

        System.out.println(letter);
        System.out.println(uniCharacter);
    } // end method

    /* Escape sequences allow you to escape characters that are used in code */
    public void exampleEscape() {
        System.out.println("My name is Roger O\'Dell. \tHow are\n you doing today?");
        System.out.println("I like to write\\ code. Happy    \b\b\b\b day\"s are here.");
    } // end method

} // end class
