package org.example;

public class mathj {
    public static void main(String[] args) {
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        System.out.println(Math.sqrt(81));
        System.out.println(Math.abs(-4.665));
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);
//Boolean
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        int x = 10;
        int y = 9;
        System.out.println(x > y);
        System.out.println(10 > 9);
        System.out.println(x == 10);
        System.out.println(15 == 10);

        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge >= votingAge); // returns true (25 year olds are allowed to vote!)
        if(myAge>=votingAge){
            System.out.println("You are old enough to vote");
        }
        else{
            System.out.println("You are not old enough to vote");
        }


    }
}
