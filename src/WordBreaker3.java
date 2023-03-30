import java.util.Scanner;

public class WordBreaker3 {
    /* This program break code and prints in separate line and is separated by space*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        for ( String word : str.split(" ")) {
            System.out.println(word);
        }
    }
}

