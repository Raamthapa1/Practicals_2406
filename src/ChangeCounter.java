public class ChangeCounter {
    /* This program asks the user to enter the number of
     pennies, nickels, dimes, and quarters and calculate
     the total amount of money in dollars.
     */

    public static void main(String[] args) {
        int pennies; // Number of pennies entered by user.
        int nickels; // Number of nickels entered by user.
        int dimes; // Number of dimes entered by user.
        int quarters; // Number of quarters entered by user.
        double total; // Total amount of money in dollars.
        System.out.print("How many pennies do you have?\n");
        pennies = textio.TextIO.getlnInt();
        System.out.print("How many nickels do you have? ");
        nickels = textio.TextIO.getlnInt();
        System.out.print("How many dimes do you have? ");
        dimes = textio.TextIO.getlnInt();
        System.out.print("How many quarters do you have? ");
        quarters = textio.TextIO.getlnInt();
        total = (pennies * 0.01) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25);
        System.out.printf("You have $%.2f in total.%n", total);
    }
}
