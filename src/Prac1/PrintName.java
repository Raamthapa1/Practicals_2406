package Prac1;

import java.time.Year;

public class PrintName {
 /* Ask user for name and print it */

    public static void main(String[] args) {
    String name; // User's name.
    System.out.print("Please type your name: ");
    name = textio.TextIO.getln();
    name = name.toUpperCase();
    System.out.println("Hello, " + name + "!");
    int age;
    age = printAge();
    System.out.println( name + " Your age is " + age);
    System.out.println( " Your birth year is " + birthYear());
    }

    /* create a new function to ask user for age and print it */
    public static int printAge() {
    int age; // User's age.
    System.out.print("Please type your age: ");
    age = textio.TextIO.getlnInt();
    while ( age > 100  ) {
        System.out.println("You are too old to be using this program");
        System.out.print("Please type your age: ");
        age = textio.TextIO.getlnInt();

    }

       return age;
    }

    public static int birthYear() {
    int birthYear;
    int age = printAge();
    int current_year = Year.now().getValue();
    birthYear = current_year - age;
    return birthYear;

    }

}


