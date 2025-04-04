package org.example;


public class InnerOuterj {
    String outerElement = "Iam the element in outer class";
    static class MyClass{
        String innerElement = "Iam the element in inner class";
        private static class MyClassInner{
            private String deeperElement = "Iam the element in Deeper class";
            public  String setDeeperElement(String newName){
                return this.deeperElement = newName;
            }
            public String getDeeperElement(){
                return deeperElement;

            }
        }

    }
    public static void main(String[] args) {
        InnerOuterj myObjt = new InnerOuterj();
        System.out.println(myObjt.outerElement);
        InnerOuterj.MyClass j = new InnerOuterj.MyClass();
        System.out.println(j.innerElement);
        InnerOuterj.MyClass.MyClassInner k = new InnerOuterj.MyClass.MyClassInner();
        System.out.println(k.getDeeperElement());// Using Get method to get Element
        k.setDeeperElement("I am Deeper element that got changed by set Method");
        System.out.println(k.deeperElement);//Using direct representation of the element
    }
}
/*Java Inner Classes
In Java, it is also possible to nest classes (a class within a class).
The purpose of nested classes is to group classes that belong together,
which makes your code more readable and maintainable.
To access the inner class, create an object of the outer class, and then create an object of the inner class:
Private Inner Class
Unlike a "regular" class, an inner class can be private or protected.
If you don't want outside objects to access the inner class, declare the class as private:
Static Inner Class
An inner class can also be static, which means that you can access it without creating an object of the outer class:*/