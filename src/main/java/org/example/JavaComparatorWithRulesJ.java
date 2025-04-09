package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
public class JavaComparatorWithRulesJ {

        public static void main(String[] args) {

            ArrayList<Integer> myNumbers = new ArrayList<Integer>();
            myNumbers.add(33);
            myNumbers.add(15);
            myNumbers.add(20);
            myNumbers.add(34);
            myNumbers.add(8);
            myNumbers.add(12);
            myNumbers.add(19);
            myNumbers.add(16);
            myNumbers.add(54);
            myNumbers.add(53);
            myNumbers.add(6);
            myNumbers.add(17);
            Comparator comparator = new SortByOdd();
            Collections.sort(myNumbers, comparator);
            for (int n : myNumbers) {
                System.out.println(n);
            }

        }

}
class SortByOdd implements Comparator {
    public int compare(Object objt1, Object objt2) {
        // Make sure the objects are integers
        Integer a = (Integer) objt1;
        Integer b = (Integer) objt2;
        // Check each number to see if it is Odd
        // A number is even if the remainder when dividing by 2 is 0 so if we need even change condition
        boolean aISEven = (a%2) == 0;
        boolean bISEven = (b%2) == 0;
        boolean aIsOdd = (a % 2) != 0;
        boolean bIsOdd = (b % 2) != 0;
        if (aIsOdd == bIsOdd) {

            // If both numbers are even or both are odd then use normal sorting rules
            if (a < b) return -1;
            if (a > b) return 1;
            return 0;

        } else {

            // If a is even then it goes first, otherwise b goes first
            if (aIsOdd) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
/*Comparators can also be used to make special sorting rules for strings and numbers.
In this example we use a comparator to list all of the even numbers before the odd ones:*/