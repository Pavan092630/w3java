package org.example;

import java.util.HashMap;

public class Javahashmapj {
    /*Java HashMap
In the ArrayList chapter, you learned that Arrays store items as an ordered collection,
and you have to access them with an index number (int type). A HashMap however, store items in "key/value" pairs,
and you can access them by an index of another type (e.g. a String).
One object is used as a key (index) to another object (value).
It can store different types: String keys and Integer values, or the same type, like: String keys and String values:*/
    public static void main(String[] args) {
        HashMap<String, Integer> noOfCenturies = new HashMap<String, Integer>();
        noOfCenturies.put("Sachin Tendulkar",100);
        noOfCenturies.put("Virat Kohli",82);
        noOfCenturies.put("Rohit Sharma",49);
        noOfCenturies.put("MS Dhoni",16);
        noOfCenturies.put("Rahul Dravid",48);
        noOfCenturies.put("Virendra Sehwag",38);
        System.out.println(noOfCenturies);
        //To access a value in the HashMap, use the get() method and refer to its key:
        System.out.println(noOfCenturies.get("Virat Kohli"));
        //To remove an item, use the remove() method and refer to the key:
        noOfCenturies.remove("MS Dhoni");
        System.out.println(noOfCenturies);
        noOfCenturies.put("MS Dhoni",16);
        System.out.println(noOfCenturies);
        //To remove all items, use the clear() method:
        //To find out how many items there are, use the size() method:
        /*Loop through the items of a HashMap with a for-each loop.
          Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:
          Keys and values in a HashMap are actually objects. In the examples above, we used objects of type "String".
          Remember that a String in Java is an object (not a primitive type). To use other types, such as int,
          you must specify an equivalent wrapper class: Integer.
          For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:*/
        for (String i : noOfCenturies.keySet()) {
            System.out.println(i);
            System.out.println(noOfCenturies.get(i));
        }

    }
}
