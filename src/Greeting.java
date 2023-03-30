import textio.TextIO;

public class Greeting {
    /*  This program Ask user for name and print it
    *   in uppercase with greetings
    *  */

    public static void main(String[] args) {
        String name; // User's name entered by user.
        String upperCaseName; // User's name in upper case.
        System.out.print("Please type your name: ");
        name = TextIO.getln();
        upperCaseName = name.toUpperCase();
        System.out.println("Hello, " + upperCaseName + ", nice to meet you!");

    }
}
