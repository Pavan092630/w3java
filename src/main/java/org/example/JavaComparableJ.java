package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class JavaComparableJ {
    public static void main(String[] args) {
        ArrayList<Cars> myCars = new ArrayList<Cars>();
        myCars.add(new Cars("BMW", "X5", 1999));
        myCars.add(new Cars("Honda", "Accord", 2006));
        myCars.add(new Cars("Ford", "Mustang", 1970));

        // Sort the cars
        Collections.sort(myCars);

        // Display the cars
        for (Cars c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }
    }
}
// Define a Car class which is comparable
class Cars implements Comparable {
    public String brand;
    public String model;
    public int year;

    public Cars(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    // Decide how this object compares to other objects
    public int compareTo(Object obj) {
        Cars other = (Cars)obj;
//        if (year < other.year) return -1; // This object is smaller than the other one
//        if (year > other.year) return 1;  // This object is larger than the other one
//        return 0; // Both objects are the same
        return year - other.year;
    }
}

/*The Comparable Interface
The Comparable interface allows an object to specify its own sorting rule with a compareTo() method.
The compareTo() method takes an object as an argument and compares the comparable with
the argument to decide which one should go first in a list.
Like the comparator, the compareTo() method returns a number which is:
Negative if the comparable should go first in a list.
Positive if the other object should go first in a list.
Zero if the order does not matter.
Many native Java classes implement the Comparable interface, such as String and Integer.
This is why strings and numbers do not need a comparator to be sorted.
A Common Sorting Trick
The most obvious way to sort two numbers naturally is to write something like this:
if(a.year < b.year) return -1; // a is less than b
if(a.year > b.year) return 1; // a is greater than b
return 0; // a is equal to b
But it can actually be done with just a single line:
return a.year - b.year;
This trick can also be used to easily sort things in reverse:
return b.year - a.year;
Comparator vs. Comparable
A comparator is an object with one method that is used to compare two different objects.
A comparable is an object which can compare itself with other objects.
It is easier to use the Comparable interface when possible,
 but the Comparator interface is more powerful because it allows you to sort any kind of object even if you cannot change its code.*/