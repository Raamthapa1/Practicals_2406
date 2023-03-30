public class Divisors3 {
    /* This program finds out number from 1 to 10000 which has max divisors
    * This print out the integer and number of divisors*/
    public static void main(String[] args) {
        int maxDivisors = 0;
        int numWithMaxDiv = 0;

        for (int i = 1; i <= 10000; i++) {
            int divisors = countDivisors(i);
            if (divisors > maxDivisors) {
                maxDivisors = divisors;
                numWithMaxDiv = i;
            }
        }

        System.out.println("The integer with the largest number of divisors is " + numWithMaxDiv + ".");
        System.out.println("It has " + maxDivisors + " divisors.");
    }

    public static int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

}
