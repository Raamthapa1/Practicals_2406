package Prac4;

import java.util.Scanner;

public class Capatilise4 {
    /* This program will capitalise the first letter of each word in a sentence. */
    public static void main(String[] args) {
        System.out.println("Please input a string to capitalise: ");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        System.out.println(capitalise(sentence));

    }

    public static String capitalise(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sentenceBuilder = new StringBuilder(sentence);
        for (String word : words) {
            String firstLetter = word.substring(0, 1);
            String restOfWord = word.substring(1);
            String capitalisedWord = firstLetter.toUpperCase() + restOfWord;
            sentenceBuilder.append(capitalisedWord).append(" ");
        }
        sentence = sentenceBuilder.toString();
        return sentence;
    }
}