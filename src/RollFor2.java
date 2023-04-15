import Prac5.PairOfDice5;

public class RollFor2 {
    public static void main(String[] args) {
        /* */
        PairOfDice5 dice = new PairOfDice5();
        int rolls = 0;
        do {
            dice.roll();
            rolls++;
        } while (dice.getTotal() != 2);
        System.out.println("It took " + rolls + " rolls to get 2 on both dice.");
    }
}
