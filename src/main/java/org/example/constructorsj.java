package org.example;

public class constructorsj {
    int x;// Create a class attribute
    int modelYear;
    String carName;
    String carMaker;

    // Create a class constructor for the Main class
    //Constructors can also take parameters, which is used to initialize attributes.
    //You can have as many parameters as you want:
    public constructorsj(int y,String z,String a) {
        modelYear = y;// Set the initial value for the class attribute x
        carName = z;
        carMaker = a;

    }

    public static void main(String[] args) {
        constructorsj myObj = new constructorsj(2009,"Rav4","Toyota"); // Create an object of class Main (This will call the constructor)
        System.out.println("The car is "+myObj.carName + " made by "+myObj.carMaker+ " in "+myObj.modelYear+"."); // Print the value of all attributes.
    }
}

/*A constructor in Java is a special method that is used to initialize objects.
The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:
Note that the constructor name must match the class name, and it cannot have a return type (like void).
Also note that the constructor is called when the object is created.
All classes have constructors by default: if you do not create a class constructor yourself,
Java creates one for you. However, then you are not able to set initial values for object attributes.*/