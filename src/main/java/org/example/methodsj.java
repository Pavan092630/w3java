package org.example;

public class methodsj {
    //Nethods without return
    // public keyword makes that method only used through object. but static methods can be called directly.
    public  void calculator(int a, int b){
        int add = a+b;
        int sub = a-b;
        int multiply = a*b;
        float divide = (float) (int) a /b;
        System.out.println("Addition of the Numbers " + add);
        System.out.println("Subtraction of the Numbers " + sub);
        System.out.println("Multiplication of the Numbers " + multiply);
        System.out.println("Division of the Numbers " + divide);
    }
    //Methods with return
    static int add(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        if (a>b) {
            return a - b;
        }
        else{
            return b-a;
        }

    }
    static int mul(int a, int b){
        return a*b;
    }
    static float div(int a, int b){
        return (float) a /b;
    }

    //Method Overloading
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }


    public static void main(String[] args) {
        methodsj myobject3 = new methodsj();

        myobject3.calculator(8,5);
        System.out.println(add(5,8));
        System.out.println(sub(8,5));
        System.out.println(mul(5,8));
        System.out.println(div(8,5));
        System.out.println(plusMethod(3.66,4.82));
        System.out.println(plusMethod(6,9));
    }
}
/*A method is a block of code which only runs when it is called.

You can pass data, known as parameters, into a method.

Methods are used to perform certain actions, and they are also known as functions.

Why use methods? To reuse code: define the code once, and use it many times.
A method must be declared within a class. It is defined with the name of the method, followed by parentheses ().
Java provides some pre-defined methods, such as System.out.println(),
but you can also create your own methods to perform certain actions:*/