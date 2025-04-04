package org.example;
// here iam inheriting the methods of packagesuserinputj to Inheritancej because of that iam able to use
//the mycar method by using the Inheritancej object.
//If you don't want other classes to inherit from a class, use the final keyword:

public class Inheritancej extends packagesuserinputj {
    protected String name ="Iam a protected String from class Inheritancej";
    public void inheritance(){
        System.out.println("Iam the inheritance method");
    }

    public static void main(String[] args) {
        Inheritancej mycar = new Inheritancej();
        mycar.mycar();

    }

}
/*Java Inheritance (Subclass and Superclass)
In Java, it is possible to inherit attributes and methods from one class to another.
We group the "inheritance concept" into two categories:
subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from
To inherit from a class, use the extends keyword.
In the example below, the Car class (subclass) inherits the attributes and methods from the Vehicle class (superclass):*/