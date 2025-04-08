package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class javaIteratorj {
    public static void main(String[] args) {

        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();
        // Print the first item
       // System.out.println(it.next());
        //To loop through a collection, use the hasNext() and next() methods of the Iterator:
        //Mostly use while or Do while Loop for iterators
        //Trying to remove items using a for loop or a for-each loop would not work correctly because
        // the collection is changing size at the same time that the code is trying to loop.
        do {
            System.out.println(it.next());
        } while (it.hasNext());
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        numbers.add(15);
        numbers.add(6);
        numbers.add(10);
        numbers.add(99);
        System.out.println("The old ArrayList is "+numbers);
        //Iterators are designed to easily change the collections that they loop through.
        // The remove() method can remove items from a collection while looping.
        Iterator<Integer> its = numbers.iterator();
        while(its.hasNext()) {
            Integer i = its.next();
            if(i < 10) {
                its.remove();
                System.out.println(i+" is removed from the ArrayList");
            }
        }
        System.out.println("The New Array List is "+numbers);
    }
}
/*Java Iterator
An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
It is called an "iterator" because "iterating" is the technical term for looping.
To use an Iterator, you must import it from the java.util package.
The iterator() method can be used to get an Iterator for any collection:*/