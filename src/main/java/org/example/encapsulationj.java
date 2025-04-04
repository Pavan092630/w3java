package org.example;

public class encapsulationj {
    /*Encapsulation
    The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
declare class variables/attributes as private
provide public get and set methods to access and update the value of a private variable
Get and Set
private variables can only be accessed within the same class (an outside class has no access to it).
 However, it is possible to access them if we provide public get and set methods.
The get method returns the variable value, and the set method sets the value.
Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case:
Why Encapsulation?
Better control of class attributes and methods
Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
Flexible: the programmer can change one part of the code without affecting other parts
Increased security of data
*/
    public static void main(String[] args) {
        modifiersj myobject = new modifiersj();
        System.out.println(myobject.prctdstrng);
        System.out.println(myobject.getPrvtstrng());
        myobject.setPrvtstrng("I am being acessed by encapsulation file");
        System.out.println(myobject.getPrvtstrng());
        myobject.modiff();
        constructorsj myobject1 = new constructorsj(1999,"RAV4","Toyota");
        System.out.println(myobject1.carMaker);
        myobject1.carMaker = "BMW";
        System.out.println(myobject1.carMaker);

    }
}
