package Prac4;

import java.util.Random;
import java.util.Scanner;

public class RollingDice4 {
    public static void main(String[] args) {
        /* */
        System.out.println("Please type the total you want on dice");
        Scanner input = new Scanner(System.in);
        int total = input.nextInt();
        if (total < 2 || total > 12) {
            throw new IllegalArgumentException("Impossible total for a pair of dice.");
        }
        System.out.println("It took " + diceRoller(total) + " rolls to get " + total + " on both dice.");

    }

    public static int diceRoller(int n){

        Random rand = new Random();
        int die1, die2, rolls = 0;

        do {
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            rolls++;
        } while (die1 + die2 != n);

        return rolls;

    }
}







