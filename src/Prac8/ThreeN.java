package Prac8;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * This program prints the sequence of 3n+1 where n is the number entered by the user
 */
public class ThreeN {


    private static final BigInteger THREE = new BigInteger("3");
    private static final BigInteger ONE = new BigInteger("1");
    private static final BigInteger TWO = new BigInteger("2");


    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );  // read user input

        String line;

        BigInteger N;  // starting point n which is specified by the user

        System.out.println("""
                This program will print 3N+1 sequences for positive starting values
                that you enter.  There is no limit on the number of
                digits in the numbers that you enter. \s
                Entering an empty line will end the program.""");


        while (true) {
            System.out.println();
            System.out.println("PLease input the starting value, or press enter to end.");
            System.out.print(">>> ");
            line = scanner.nextLine().trim();
            if (line.length() == 0)
                break;
            try {
                N = new BigInteger(line);
                if (N.signum() == 1)
                    printThreeNSequence(N);
                else
                    System.out.println("Error:  Starting value must be more than zero.");
            }
            catch (NumberFormatException e) {
                System.out.println("Error:  \"" + line + "\" is not a legal integer.");
            }
        }

        System.out.println();
        System.out.println("OK. bye, bye!");

    }  // end main()


    /**
  Subroutine to print the 3N+1 sequence starting from N, and count the number
     */
    private static void printThreeNSequence(BigInteger N) {

        assert N != null && N.signum() == 1 : "Illegal parameter value.";

        int count;

        System.out.println();
        System.out.println("the sequence starting from  " + N + " is:");
        System.out.println();

        System.out.println(N);   //
        count = 1;

        while ( ! N.equals(ONE) ){
            if (!N.testBit(0)) {
                // N is even.  Divide N by 2.
                N = N.divide(TWO);
            }
            else {

                N = N.multiply(THREE);
                N = N.add(ONE);
            }
            System.out.println(N);
            count++;
        }

        System.out.println();
        System.out.println("Total " + count + " terms in the sequence of 3n+1.");

    }


} // end ThreeN
