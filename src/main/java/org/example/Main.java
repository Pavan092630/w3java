package org.example;
/*Type casting in java
* Type casting is when you assign a value of one primitive data type to another type.

In Java, there are two types of casting:
* Widening casting is done automatically when passing a smaller size type to a larger size type:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte
* Narrowing casting must be done manually by placing the type in parentheses () in front of the value:*/

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Set the maximum possible score in the game to 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

    /* Calculate the percentage of the user's score in relation to the maximum available score.
    Convert userScore to float to make sure that the division is accurate */
        float percentage = (float) userScore / maxScore * 100.0f;

        // Print the result
        System.out.println("User's percentage is " + percentage);
    }
        }

