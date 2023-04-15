package Prac3;

import java.util.Random;

public class SnakeEyes3 {
    /* program which simulates roll of 2 dice and counts the number of times to get 1 on both dice
    * */
    public static void main(String[] args) {
        Random rand = new Random();
        int die1, die2, rolls = 0;

        do {
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            rolls++;
        } while (die1 != 1 || die2 != 1);

        System.out.println("It took " + rolls + " rolls to get snake eyes.");
    }
}





