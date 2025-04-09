package org.example;

import java.util.ArrayList;
import java.util.function.Consumer;
interface MyFunction {
    int apply(int x, int y);
}
interface StringFunction {
    String run(String str);
}
public class JavaLambdaExpressionsJ {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        //Using the Consumer Interface
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );

        //use for foreach to print arraylist using lambda expressions.
        numbers.forEach((k) -> {System.out.println(k);});

        //calling a method to take parameters from lamda expressions
        MyFunction add =(a,b) ->{return a+b;};
        MyFunction mul =(a,b) ->a*b;

        //using the method to print using the values
        System.out.println(mul.apply(5,6));
        System.out.println(add.apply(5,6));

        //Using the second Interface method
        StringFunction exclaim = (s-> s +"!");
        StringFunction qstn = (s -> s+"?" );
        System.out.println(exclaim.run("Hello"));
        System.out.println(qstn.run("Hello"));
        printFormatted("Hello",exclaim);
        printFormatted("Hello",qstn);
    }
    // Format function taking two parameters
    public static void printFormatted (String str , StringFunction format){
       String result = format.run(str);
        System.out.println(result);
    }
}
/*Java Lambda Expressions
Lambda Expressions were added in Java 8.
A lambda expression is a short block of code which takes in parameters and returns a value.
Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
The simplest lambda expression contains a single parameter and an expression:
parameter -> expression
(parameter1, parameter2) -> { code block }
Expressions are limited. They have to immediately return a value, and they cannot contain variables, assignments or statements
such as if or for. In order to do more complex operations, a code block can be used with curly braces.
If the lambda expression needs to return a value, then the code block should have a return statement.
Lambda expressions can be stored in variables if the variable's type is an interface which has only one method.
The lambda expression should have the same number of parameters and the same
return type as that method. Java has many of these kinds of interfaces built in, such as the Consumer interface
 (found in the java.util package) used by lists.*/