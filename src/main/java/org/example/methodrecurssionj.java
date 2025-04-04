package org.example;

public class methodrecurssionj {
    /*Recursion is the technique of making a function call itself. This technique provides a way to break
    complicated problems down into simple problems which are easier to solve.*/
    public static int sum(int k) {
        if (k > 0) {
           return k + sum(k - 1);
        } else {
            return 0;
        }
    }
    // Halting Condition here we can start from between this is also example of method overload
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

    public static void main(String[] args) {
        int total = sum(10);
        int totalh = sum(5,10);
        System.out.println("The sum of numbers from 0 to 10 is "+total);
        System.out.println("The sum of numbers from 5 to 10 is "+totalh);
    }
}
