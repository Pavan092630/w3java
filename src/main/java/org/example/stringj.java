package org.example;

public class stringj {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("M"));
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

        String x = "10";
        String y = "20";
        String z = x + y;
        System.out.println(z);
        int a = 20;
        String b = x + a;
        System.out.println(b);

        String txt1 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt1);

        String txt2 = "It\'s alright.";
        System.out.println(txt2);

        String txt3 = "The character \\ is called backslash.";
        System.out.println(txt3);

        String txt4 = "Hello\nWorld!";
        System.out.println(txt4);

        String txt5 = "Hello\rWorld!";
        System.out.println(txt5);

        String txt6 = "Hello\tWorld!";
        System.out.println(txt6);

        String txt7 = "Hel\blo World!";
        System.out.println(txt7);


    }
}
