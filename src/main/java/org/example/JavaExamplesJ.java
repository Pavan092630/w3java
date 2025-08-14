package org.example;

import java.util.Scanner;

public class JavaExamplesJ {
    public static void main(String[] args) {
        Scanner myobject = new Scanner(System.in);
        System.out.println("Enter your First Number");
        int firstNumber = myobject.nextInt();
        myobject.nextLine();
        System.out.println("Enter your Second Number");
        int secondNumber = myobject.nextInt();
        myobject.nextLine();
        System.out.println("Please Select your options to do the Calculations");
        System.out.println("1 For Addition");
        System.out.println("2 for Substraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Divison");
        int option = myobject.nextInt();
        myobject.nextLine();
        switch (option) {
            case 1:
                addition(firstNumber, secondNumber);
                break;
            case 2:
                substraction(firstNumber, secondNumber);
                break;
            case 3:
                multiplication(firstNumber, secondNumber);
                break;
            case 4:
                divison(firstNumber, secondNumber);
                break;
            default:
                if(option>0 && option<=4){
                    System.out.println("Thanks For using Our Application");
                }else{
                    System.out.println("Please use only Specified options on the Application");
                }
                break;
        }
        // Bitwise Moving of the Values 7 is 00000111 move i will 00000011
        int i =7>>1;
        int y =i>>1;
        System.out.println(y);

    }
    public static void addition(int a,int b){
        int addition = a+b;
        System.out.println("Addition of Two Numbers is "+addition);

    }
    public static void substraction(int a,int b){
        //int substraction;
        if(a>=b) {
            //substraction = a - b;
            System.out.println("Normal Substraction no change of order of two numbers is " + (a-b));
        }else {
           // substraction = b-a;
            System.out.println("Changed the order to do Normal Substraction  is "+(b-a));
            System.out.println("If we dont change the order your Substraction will be " +(a-b));
        }

    }
    public static void multiplication(int a,int b){
        int multiplication = a*b;
        System.out.println("Multiplication of Two Numbers is "+multiplication);

    }
    public static void divison(int a,int b){
        float divison;
        divison = (float) a/b;
        float remainder = (float)a%b;
        System.out.println("Divison of Two Numbers is "+divison+" and Remainder is "+remainder);

    }

}
