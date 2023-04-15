package Prac1;

public class FirstLastName {
    /* This program takes full name from user separated by space and counts the
    characters in each name and prints the total number of characters in each name.
    It also prints the initials of the name in upper case.
    */

    public static void main(String[] args) {
        String fullName; // User's full name entered by user.
        int space; // Position of space in name.
        String firstName; // First name, as a separate string.
        String lastName; // Last name, as a separate string.
        System.out.print("Please type your first name and last name, separated by space: ");
        fullName = textio.TextIO.getln();
        space = fullName.indexOf(' ');
        firstName = fullName.substring(0, space);
        lastName = fullName.substring(space + 1);
        System.out.printf("Your first name is %s and it has %d characters.%n", firstName, firstName.length());
        System.out.printf("Your last name is %s and it has %d characters.%n", lastName, lastName.length());
        System.out.printf("Your initials are %s and %s.", firstName.toUpperCase().charAt(0), lastName.toUpperCase().charAt(0));
    }


}
