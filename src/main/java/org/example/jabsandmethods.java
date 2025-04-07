package org.example;

public class jabsandmethods extends Animal2{
    @Override
    public void animalsound() {
        System.out.println("calling the extended method the body of abstract method");
    }

    public static void main(String[] args) {
        jabsandmethods Animal = new jabsandmethods();
        Animal.sleep();
        Animal.animalsound();
        Pig pig = new Pig();
        pig.animalSound1();
        pig.sleep1();
        pig.myMethod();
        pig.myOtherMethod();
    }
}
abstract class Animal2{
    public abstract void animalsound();
    public void sleep(){
        System.out.println("Make the normal method sound");
    }

}
/*An interface is a completely "abstract class" that is used to group related methods with empty bodies:
* To access the interface methods, the interface must be "implemented" (kinda like inherited) by
 another class with the implements keyword (instead of extends).
 The body of the interface method is provided by the "implement" class:
Notes on Interfaces:
Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
Interface methods do not have a body - the body is provided by the "implement" class
On implementation of an interface, you must override all of its methods
Interface methods are by default abstract and public
Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects)
Why And When To Use Interfaces?
1) To achieve security - hide certain details and only show the important details of an object (interface).

2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces,
* because the class can implement multiple interfaces. Note:
* To implement multiple interfaces, separate them with a comma (see example below).*/
// Interface
interface Animal3 {
    public void animalSound1(); // interface method (does not have a body)
    public void sleep1(); // interface method (does not have a body)
}
interface FirstInterface {
    public void myMethod(); // interface method
}

interface SecondInterface {
    public void myOtherMethod(); // interface method
}

// Pig "implements" the Animal interface,FirstInterface, SecondInterface multiple interfaces implemented below.
class Pig implements Animal3, FirstInterface, SecondInterface {
    public void animalSound1() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep1() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
    public void myMethod() {
        System.out.println("Some text..");
    }
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}
/*Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).
The abstract keyword is a non-access modifier, used for classes and methods:
Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
An abstract class can have both abstract and regular methods:
To access the abstract class, it must be inherited from another class. Let's convert the Animal class we used in the Polymorphism chapter to an abstract class:
Use Abstract Classes and Methods?
To achieve security - hide certain details and only show the important details of an object.*/