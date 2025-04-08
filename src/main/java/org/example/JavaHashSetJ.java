package org.example;

import java.util.HashSet;

public class JavaHashSetJ {
    public static void main(String[] args) {
        HashSet<String> mycars = new HashSet<String>();
        //The HashSet class has many useful methods. For example, to add items to it, use the add() method:
        mycars.add("Tayota");
        mycars.add("BMW");
        mycars.add("Mercedez");
        mycars.add("Honda");
        //To check whether an item exists in a HashSet, use the contains(),remove(),clear(),size() method:
        System.out.println(mycars.contains("Tayota"));
        //For Each loop
        for(String i:mycars){
            System.out.println(i);
        }
        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for(int i = 1; i <= 10; i++) {
            if(numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}
/*Java HashSet
A HashSet is a collection of items where every item is unique, and it is found in the java.util package:
Items in an HashSet are actually objects. In the examples above, we created items (objects) of type "String".
 Remember that a String in Java is an object (not a primitive type). To use other types, such as int, you must specify an equivalent wrapper class:
Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:*/