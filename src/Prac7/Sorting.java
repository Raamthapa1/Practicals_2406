package Prac7;

import textio.TextIO;

/**
THis program ask for  numbers upto 100 and sorts them in ascending order. This program used selevtion
 sort algorithm.
 */

public class Sorting {

    public static void main(String[] args) {

        double[] numbers;  // An array for storing  the input values in real number.
        int numCt;         // The number of numbers.
        double input_num;        // One of the numbers input by the user.

        numbers = new double[100];
        numCt = 0;

        System.out.println(" Please enter up to 100 positive numbers and 0 to close the program");

        while (true) {
            System.out.print(">>> ");
            input_num = TextIO.getlnDouble();
            if (input_num <= 0)
                break;
            numbers[numCt] = input_num;
            numCt++;
        }

        selectionSort(numbers, numCt);

        System.out.println("\nThe numbers that you have entered " +
                " in ascending sorted order are:\n");

        for (int i = 0; i < numCt; i++) {
            System.out.println( numbers[i] );
        }

    }

    /**
     *Sorting the number using selection sort algorithm
     */
    static void selectionSort(double[] A, int count) {
        for ( int lastPlace = count - 1; lastPlace > 0; lastPlace-- ) {
            int maxLoc = 0;
            for (int j = 1; j <= lastPlace; j++) {
                if (A[j] > A[maxLoc]) {
                    maxLoc = j;
                }
            }
            double temp = A[maxLoc];
            A[maxLoc] = A[lastPlace];
            A[lastPlace] = temp;
        }
    }

}