package Prac4;

import textio.TextIO;


public class HexDecimalConverter4 {
    /*This program will convert hexadecimal to base 10 value*/

    public static void main(String[] args) {
        String hexadecimal;  // Input from user, hexadecimal .
        long decimal;    // Decimal (base-10) equivalent of hexadecimal number.
        int i;       // A position in hexadecimal, from 0 to hexadecimal.length()-1.
        System.out.print("Enter a hexadecimal number: ");
        hexadecimal = TextIO.getlnWord();
        decimal = 0;
        for ( i = 0; i < hexadecimal.length(); i++ ) {
            int digit = hexValue( hexadecimal.charAt(i) );
            if (digit == -1) {
                System.out.println("Error:  Input is not a hexadecimal number.");
                return;  // Ends the main() routine.
            }
            decimal = 16*decimal + digit;
        }
        System.out.println("Base-10 value of " + hexadecimal +  " is "  + decimal);
    }  // end main


    public static int hexValue(char c) {
        /* Returns the hexadecimal value of a given character, or -1 if it is not
         * a valid hexadecimal digit. */
        return switch (Character.toUpperCase(c)) {
            case '0' -> 0;
            case '1' -> 1;
            case '2' -> 2;
            case '3' -> 3;
            case '4' -> 4;
            case '5' -> 5;
            case '6' -> 6;
            case '7' -> 7;
            case '8' -> 8;
            case '9' -> 9;
            case 'A' -> 10;
            case 'B' -> 11;
            case 'C' -> 12;
            case 'D' -> 13;
            case 'E' -> 14;
            case 'F' -> 15;
            default -> -1;
        };
    }
}

