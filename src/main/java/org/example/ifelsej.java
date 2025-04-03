package org.example;

public class ifelsej {
    public static void main(String[] args) {

        /* Java Conditions and If Statements
You already know that Java supports the usual logical conditions from mathematics:

Less than: a < b
Less than or equal to: a <= b
Greater than: a > b
Greater than or equal to: a >= b
Equal to a == b
Not Equal to: a != b
You can use these conditions to perform different actions for different decisions.

Java has the following conditional statements:

Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed*/
        //if
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }

        //if else
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        //else if
        int times = 15;
        if (times < 10) {
            System.out.println("Good morning.");
        } else if (times < 18) {
            System.out.println("Good day.");
        }  else {
            System.out.println("Good evening.");
        }

        //Short hand if else Syntax variable = (condition) ? expressionTrue :  expressionFalse;
        String out = (times<18) ? "Good Day" : "Good Evening";
        System.out.println(out);

        // examples
        int doorCode = 1337;

        if (doorCode == 1337) {
            System.out.println("Correct code. The door is now open.");
        } else {
            System.out.println("Wrong code. The door remains closed.");
        }

        // positive or negative number

        int myNum = 10; // Is this a positive or negative number?

        if (myNum > 0) {
            System.out.println("The value is a positive number.");
        } else if (myNum < 0) {
            System.out.println("The value is a negative number.");
        } else {
            System.out.println("The value is 0.");
        }

        //odd or even
        int myNum1 = 6;

        if (myNum1 % 2 == 0) {
            System.out.println(myNum1 + " is even");
        } else {
            System.out.println(myNum1 + " is odd");
        }


    }
}
