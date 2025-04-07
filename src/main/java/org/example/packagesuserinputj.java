package org.example;

import java.util.Scanner;//importing util package with Scanner class

public class packagesuserinputj {
    /*Java Packages & API
A package in Java is used to group related classes. Think of it as a folder in a file directory.
We use packages to avoid name conflicts, and to write a better maintainable code.
Packages are divided into two categories:
Built-in Packages (packages from the Java API)
User-defined Packages (create your own packages)
The Java API is a library of prewritten classes, that are free to use, included in the Java Development Environment.
The library contains components for managing input, database programming, and much much more.
The complete list can be found at Oracles website: https://docs.oracle.com/javase/8/docs/api/.
The library is divided into packages and classes. Meaning you can either import a single class (along with its methods and attributes),
or a whole package that contain all the classes that belong to the specified package.
To use a class or a package from the library, you need to use the import keyword:
import java.util.*; to import all classes from util package*/
   // public static void main(String[] args) {
    public void mycar(){
        Scanner mycar = new Scanner(System.in);
        System.out.println("Please enter the year of Built");
        int Year = mycar.nextInt();
        mycar.nextLine();
        System.out.println("Enter the  Make of your car");
        String Make = mycar.nextLine();
        System.out.println("Enter the Model of the car");
        String Model = mycar.nextLine();
        constructorsj mycaratrbute = new constructorsj(Year, Model , Make);
        System.out.println("The car is "+mycaratrbute.carName + " made by "+mycaratrbute.carMaker+ " in "+mycaratrbute.modelYear+".");

    }
}
/*The Scanner class is used to get user input, and it is found in the java.util package.
To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation.
In our example, we will use the nextLine() method, which is used to read Strings:
nextBoolean()	Reads a boolean value from the user
nextByte()	Reads a byte value from the user
nextDouble()	Reads a double value from the user
nextFloat()	Reads a float value from the user
nextInt()	Reads a int value from the user
nextLine()	Reads a String value from the user
nextLong()	Reads a long value from the user
nextShort()	Reads a short value from the user*/