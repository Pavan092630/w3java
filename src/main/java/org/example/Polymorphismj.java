package org.example;

public class Polymorphismj {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.animalSound();
        Dog myDog = new Dog();
        myDog.animalSound();
        Cat myCat = new Cat();
        myCat.animalSound();
    }

}
class Animal{
    public void animalSound(){
        System.out.println("This is Animal Class with Animalsound()");
    }
}
class Dog extends Animal{
    public void animalSound(){
        System.out.println("This is Dog Class with Animalsound()");
    }
}
class Cat extends Animal{
    public void animalSound(){
        System.out.println("This is Cat Class with Animalsound()");
    }
}
/*Java Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class.
Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.
Why And When To Use "Inheritance" and "Polymorphism"?
- It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.*/