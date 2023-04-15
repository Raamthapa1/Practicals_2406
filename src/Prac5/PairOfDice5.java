package Prac5;

import java.util.Random;

/* An object of class PairOfDice represents a pair of dice,
     * where each die shows a number between 1 and 6.  The dice
     * can be rolled, which randomizes the numbers showing on the
     * dice. This class will  be used by another programing RollFor2 having main there.
    * */
    public class PairOfDice5 {
        private int die1;   // Number on the first die.
        private int die2;   // Number  on the second die.
        private final Random rand;  // A random number generator for rolling the dice.
        public PairOfDice5() {
            /* Constructor creates a pair of dice and rolls them,
             * so that they initially show some random values.
            * */
            rand = new Random();
            roll();
        }
        public void roll() {
            /* Roll the dice by setting each of the dice to be
             * a random number between 1 and 6.
            * */
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
        }


        public int getTotal() {
            /* Return the total showing on the two dice.
            * */
            return die1 + die2;
        }

}

