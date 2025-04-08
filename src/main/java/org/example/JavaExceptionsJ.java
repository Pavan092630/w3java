package org.example;

import java.lang.reflect.Array;
import java.util.Scanner;

public class JavaExceptionsJ {
    /*The throw statement allows you to create a custom error.
The throw statement is used together with an exception type. There are many exception types available in Java:
ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:*/
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[] args) {
        try{
            int[] pavan ={1,2,3,4,5,6,7,8,9,10};
            System.out.println(pavan[9]);
        } catch (Exception e) {
            assert System.out != null;
            System.out.println("Please Check the Parameters of array intilized");
        }
        finally {
            assert System.out != null;
            System.out.println("try catch is done ");
        }
        Scanner pavan1 = new Scanner(System.in);
        System.out.println("Enter your age");
        int age1 =pavan1.nextInt();
        pavan1.nextLine();
        checkAge(age1);

    }
}
/*ArithmeticError:	Occurs when a numeric calculation goes wrong
ArrayIndexOutOfBoundsException:	Occurs when trying to access an index number that does not exist in an array
ClassFormatError:	Occurs when a class file cannot be accessed
ClassNotFoundException:	Occurs when trying to access a class that does not exist
ConcurrentModificationException:	Occurs when an element is added or removed from iterables
FileNotFoundException:	Occurs when a file cannot be accessed
IncompatibleClassChangeError:	Occurs when there's been a change in a base class after a child class has already been initialized
InputMismatchException:	Occurs when entering wrong input (e.g. text in a numerical input)
InterruptedException:	Occurs when a Thread is interrupted while waiting/sleeping
InvalidClassException:	Occurs when the Serialization runtime observes a problem with a class
IOException	:Occurs when an input or output operation fails
NegativeArraySizeException:	Occurs when trying to create an array with negative size
NoClassDefFoundError:	Occurs when the class is not found at runtime
NoSuchFieldException:	Occurs when trying to access a class field/variable that does not exist
NoSuchMethodException:	Occurs when trying to access a class method that does not exist
NullPointerException:	Occurs when trying to access an object referece that is null
NumberFormatException:	Occurs when it is not possible to convert a specified string to a numeric type
RuntimeException:	Occurs when an exception occurs at runtime
StringIndexOutOfBoundsException:	Occurs when trying to access a character in a String that does not exist
TypeNotPresentException:	Occurs when a type cannot be found
IllegalArgumentException:	Occurs when when an illegal argument is passed to a method
IllegalStateException:	Occurs when when a method is called at an illegal time*/