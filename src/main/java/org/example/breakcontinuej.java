package org.example;

public class breakcontinuej {
    public static void main(String[] args) {

        // Print even or ODD numbers using continue statement.
        // we can use break statement to stop loop but continue just skip that and next loop iterated.
        for (int i = 0; i < 10; i++) {
            if (i%2 !=0) {
                continue;
            }
            System.out.println(i);
        }
        for (int j = 0; j < 10; j++) {
            if (j ==6) {
                break;
            }
            System.out.println(j);
        }

    }
}
