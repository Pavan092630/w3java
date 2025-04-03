package org.example;

public class nestedloopj {
    public static void main(String[] args) {
        //Nested Loops
        // Outer loop.
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }
        /*For each loop There is also a "for-each" loop, which is used exclusively to loop through elements in an array (or other data sets):
        * for (type variableName : arrayName) {
          // code block to be executed
           }*/
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda","Toyota","Mercedes"};
        for (String i : cars) {
            System.out.println(i);
            for(String j : cars){
                System.out.println(j);
            }
        }
        // Table printing for a given number

        int number = 2;

        // Print the multiplication table for the number 2
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
