package org.example;

public class oopsj {
    int attributex= 5;
    String attributey = "I am a attribute.";
    //If you don't want the ability to override existing values, declare the attribute as final:
    final int attributez = 100;

    public static void main(String[] args) {
        /*OOP stands for Object-Oriented Programming.

         Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented
         programming is about creating objects that contain both data and methods.
         Object-oriented programming has several advantages over procedural programming:
         OOP is faster and easier to execute
         OOP provides a clear structure for the programs
         OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
         OOP makes it possible to create full reusable applications with less code and shorter development time
      Tip: The "Don't Repeat Yourself" (DRY) principle is about reducing the repetition of code. You should extract out the
            codes that are common for the application, and place them at a single place and reuse them instead of repeating it.

       Java - What are Classes and Objects?
     Classes and objects are the two main aspects of object-oriented programming.
     Look at the following illustration to see the difference between class and objects:*/
        oopsj myObjt1 = new oopsj();
        myObjt1.attributex = 45;
        System.out.println("My age is "+myObjt1.attributex);
        System.out.println("Who are you ? "+myObjt1.attributey);
        System.out.println("My value cannot be changed Because they use final key word "+myObjt1.attributez);
        // Creating object of java from another file
        // Here add can be called directly as it is static method from the methodjs file
        //but calculator is public method it can be accesses only through the objects.
        /*you will often see Java programs that have either static or public attributes and methods.
         In the example above, we created a static method,
          which means that it can be accessed without creating an object of the class,
          unlike public, which can only be accessed by objects:
          The dot (.) is used to access the object's attributes and methods.
          To call a method in Java, write the method name followed by a set of parentheses (), followed by a semicolon (;).
          A class must have a matching filename (Main and Main.java).*/
        methodsj myObjt2 = new methodsj();
        System.out.println(myObjt2.add(5,6));
        System.out.println(myObjt2.sub(6,9));
        //
        myObjt2.calculator(5,6);

    }
}
