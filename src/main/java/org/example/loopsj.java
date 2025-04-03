package org.example;

public class loopsj {
    public static void main(String[] args) {

        // while loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        //Do while loop
        do {
            System.out.println(i);
            i++;
        }
        while (i < 9);

        //Examples
        int countdown = 10;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("Happy New Year!!");

        //Dice example
        int dice = 1;

        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzy!");
            }
            dice = dice + 1;
        }

        /*For loop for (statement 1; statement 2; statement 3) {
           code block to be executed
        }
        Statement 1 is executed (one time) before the execution of the code block.

       Statement 2 defines the condition for executing the code block.

       Statement 3 is executed (every time) after the code block has been executed.*/
        //Print 0 to 10 numbers
        for (int k = 0; k < 11; k++) {
            System.out.println(k);
        }
        // Even numbers from 0 to 30

        for ( int j = 2; j <=30; j=j+2) {
            System.out.println(j);
        }

        //Odd numbers from 0 to 30
        for(int l = 1; l <=30; l=l+2){
            System.out.println(l);
        }

    }
}
