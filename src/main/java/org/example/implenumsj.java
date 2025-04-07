package org.example;

enum Level {
    LOW(20),
    MEDIUM(35),
    HIGH(65),
     ULTRAHIGH(75),
    DEFAULT("Iam a String");
//constructors to get the values of the ENUM
int age=0;
    private String ages;
    Level(int age) {
        this.age = age;
    }
public int getAge(){
        return age;
}
Level(String ages){
        this.ages = ages;
}
public String getAges(){
        return ages;
}

}
public class implenumsj {
    public static void main(String[] args) {
        Level myvar = Level.MEDIUM;
        switch (myvar){
            case LOW:
                System.out.println(Level.LOW.getAge());
                break;
            case MEDIUM:
                System.out.println(Level.MEDIUM.getAge());
                break;
            case HIGH:
                System.out.println(Level.HIGH.getAge());
                break;
            case ULTRAHIGH:
                System.out.println(Level.ULTRAHIGH.getAge());
                break;
        }
        //Looping through the Enum
        for(Level myvar1 : Level.values()){
            if(myvar1.getAge() !=0) {
                System.out.println(myvar1.getAge());
            }else{
                System.out.println(myvar1.getAges());
            }
        }
        System.out.println(Level.LOW);
        System.out.println(Level.MEDIUM.getAge());
        System.out.println(Level.HIGH);
        System.out.println(Level.ULTRAHIGH.getAge());
        System.out.println(Level.DEFAULT.getAges());
    }
}
/*Enum is short for "enumerations", which means "specifically listed".
An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma.
Note that they should be in uppercase letters:
Difference between Enums and Classes
An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public,
static and final (unchangeable - cannot be overridden).
An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).
Why And When To Use Enums?
Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.*/