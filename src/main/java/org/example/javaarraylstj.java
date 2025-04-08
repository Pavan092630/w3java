package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class javaarraylstj {
    /*Java ArrayList
The ArrayList class is a resizable array, which can be found in the java.util package.
The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified
(if you want to add or remove elements to/from an array, you have to create a new one).
While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:
Array indexes start with 0: [0] is the first element. [1] is the second element, etc*/
    public static void main(String[] args) {
       // Declaration
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Tayota");
        cars.add("BMW");
        cars.add("Mercedez");
        cars.add("Honda");
        System.out.println(cars);
        //Using methods of Array list like set(), get(),size(),remove(),clear() etc
        System.out.println(cars.get(0));
        cars.add(0,"Hyundai");
        System.out.println(cars);
        System.out.println(cars.size());
        cars.set(0,"RAM 1500");
        System.out.println(cars.get(0));
        cars.remove(0);
        System.out.println(cars.get(0));
        System.out.println(cars.size());
        //cars.clear();
        System.out.println(cars);
        System.out.println(cars.size());
        // Looping Through the Array list using For each
        Collections.sort(cars, Collections.reverseOrder());//in reverse order both for integers and string
        for(String i:cars){
            System.out.println(i);
        }
        //Another useful class in the java.util package is the Collections class, which include the sort() method for sorting lists alphabetically or numerically:
        Collections.sort(cars);
        //Looping Through the Array list using For loop
        for(int i=0;i< cars.size(); i++){
            System.out.println(cars.get(i));
        }

    }
}
