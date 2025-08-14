package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;

public class JavaRegularExpressionJ {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[AARAV VEMULAPALLI]", CASE_INSENSITIVE);
        Scanner aarav = new Scanner(System.in);
        System.out.println("Who are you here for first name and last name ");
         String studentName= aarav.nextLine();
        Matcher matcher = pattern.matcher(studentName.toUpperCase());
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println(studentName.toUpperCase()+" is a Student here");
        } else {
            System.out.println("No Student Found");
        }
        System.out.println("Enter the Guardian Name ");
        String guardianName = aarav.nextLine();
        Pattern patterns = Pattern.compile("[PAVAN SUREKHA]", CASE_INSENSITIVE);
        Matcher matchers = patterns.matcher(guardianName.toUpperCase());
        boolean matchFounds = matchers.find();
        if(matchFounds) {
            System.out.println("Thanks For coming to Pickup "+studentName.toUpperCase());
        } else {
            System.out.println("You are not in the Guardians List we cannot allow you a passage");
        }
    }
}
