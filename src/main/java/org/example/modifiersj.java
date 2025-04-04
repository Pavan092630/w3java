package org.example;

public class modifiersj {
    /* The public keyword is an access modifier, meaning that it is used to set
    the access level for classes, attributes, methods and constructors.
    We divide modifiers into two groups:
    Access Modifiers - controls the access level
    public: 	The code is accessible for all classes
    private:	The code is only accessible within the declared class
    default:	The code is only accessible in the same package. This is used when you don't specify a modifier.
    protected:	The code is accessible in the same package and subclasses.
    Access modifiers in Java control the visibility of classes, methods, and variables. There are four types: public, private, protected, and default (no modifier). [1]

• Public: Accessible from any class, anywhere.

    public class PublicExample {
        public String message = "This is public";

        public void displayMessage() {
            System.out.println(message);
        }
    }

• Private: Accessible only within the class where it is declared.

    public class PrivateExample {
        private String secret = "This is private";

        private void hideSecret() {
            System.out.println(secret);
        }

        public void revealSecret() {
            hideSecret(); // Accessible within the class
        }
    }

• Protected: Accessible within the same package and by subclasses in other packages.

    package com.example;

    public class ProtectedExample {
        protected String value = "This is protected";

        protected void showValue() {
            System.out.println(value);
        }
    }

    package com.example.sub;
    import com.example.ProtectedExample;

    public class SubClassExample extends ProtectedExample {
        public void accessProtected() {
            System.out.println(value); // Accessible in subclass
            showValue(); // Accessible in subclass
        }
    }

• Default (no modifier): Accessible only within the same package.

    package com.example;

    class DefaultExample {
        String data = "This is default";

        void showData() {
            System.out.println(data);
        }
    }

    package com.example.another;
    import com.example.DefaultExample;

    public class AnotherClass {
        public void tryAccessDefault() {
            DefaultExample obj = new DefaultExample(); // Compilation error: not accessible
            System.out.println(obj.data); // Compilation error: not accessible
        }
    }
These modifiers enable encapsulation, prevent misuse, improve security, and enhance code maintainability.

   Non-Access Modifiers - do not control access level, but provides other functionality
   final:	Attributes and methods cannot be overridden/modified
   static:	Attributes and methods belongs to the class, rather than an object
   abstract:	Can only be used in an abstract class, and can only be used on methods.
                The method does not have a body, for example abstract void run();.
                The body is provided by the subclass (inherited from).
   transient:	Attributes and methods are skipped when serializing the object containing them
   synchronized:	Methods can only be accessed by one thread at a time
   volatile:	The value of an attribute is not cached thread-locally, and is always read from the "main memory"
   Non-access modifiers in Java are keywords that provide special instructions to the compiler,
   affecting the behavior of classes, methods, or variables, without controlling access levels.
   These modifiers include static, final, abstract, synchronized, volatile, transient, strictfp, and native.

class NonAccessModifiersExample {

    // Static variable: Belongs to the class, not a specific instance
    static int staticVariable = 10;

    // Final variable (constant): Value cannot be changed after initialization
    final double PI = 3.14159;

    // Volatile variable: Ensures that the variable is read from and written to main memory
    volatile int sharedVariable;

    // Static method: Can be called without creating an instance of the class
    public static void staticMethod() {
        System.out.println("Static method called");
    }

    // Final method: Cannot be overridden by subclasses
    public final void finalMethod() {
        System.out.println("Final method called");
    }

    // Abstract method: No implementation in this class, must be implemented by subclasses
    public abstract void abstractMethod();

    // Synchronized method: Only one thread can execute at a time
    public synchronized void synchronizedMethod() {
        // Thread-safe code here
    }

    // Transient variable: Not serialized during object serialization
    transient String temporaryData;

    // Native method: Implementation provided by native code (e.g., C, C++)
    public native void nativeMethod();

    // Strictfp method: Ensures consistent floating-point calculations across platforms
    public strictfp double strictfpMethod(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        NonAccessModifiersExample example = new NonAccessModifiersExample() {
            @Override
            public void abstractMethod() {
                System.out.println("Abstract method implemented");
            }
        };

        System.out.println("Static variable: " + NonAccessModifiersExample.staticVariable);
        System.out.println("PI: " + example.PI);

        NonAccessModifiersExample.staticMethod();
        example.finalMethod();
        example.abstractMethod();
    }
}
   */
    protected String prctdstrng = "I am a protected String";
    private String prvtstrng= "Iam a private string";
    private void  modif(){
        System.out.println(prvtstrng);
        System.out.println(prctdstrng);
    }
    public void modiff(){
        modif();
    }

    // Getter
    public String getPrvtstrng() {
        return prvtstrng;
    }

    // Setter
    public void setPrvtstrng(String newName) {
        this.prvtstrng = newName;
    }


    public static void main(String[] args) {
        modifiersj modd= new modifiersj();
        modd.modiff();
        modd.modif();
    }
}
