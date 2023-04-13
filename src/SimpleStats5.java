import java.util.Scanner;

public class SimpleStats5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        StatCalc5 calc;
        calc = new StatCalc5();

        double item; // One number read from the user.

        System.out.println("Enter your numbers.  Enter 0 to end the program.");
        System.out.println();

        do {
            System.out.print("? ");
            item = in.nextDouble();
            if (item != 0)
                calc.enter(item);
        } while (item != 0);

        System.out.println("\nStatistics of data entered :\n");
        System.out.println("   Count:              " + calc.getCount());
        System.out.println("   Sum:                " + calc.getSum());
        System.out.println("   Minimum:            " + calc.getMin());
        System.out.println("   Maximum:            " + calc.getMax());
        System.out.println("   Average:            " + calc.getMean());
        System.out.println("   Standard Deviation: " + calc.getStandardDeviation());

    }

}

