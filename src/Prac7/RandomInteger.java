package Prac7;
import java.util.ArrayList;
public class RandomInteger {

    public static ArrayList<Integer> makeRandomInts( int count, int maximum ) {
        if (count > maximum) {
            throw new IllegalArgumentException("We cannot have " + count +
                    " integers in the range  1 to " + maximum);
        }
        ArrayList<Integer> numbs = new ArrayList<>();
        while (numbs.size() < count) {
            int num = (int)(Math.random()*maximum) + 1;
            if (!numbs.contains(num))
                numbs.add( num );
        }
        return numbs;
    }

    public static void main(String[] args) {
        System.out.println("10 integers chosen from the range 1 to 100 are :");
        for (int i = 0; i < 8; i++)
            System.out.println( makeRandomInts(10,100) );
        System.out.println();
        System.out.println("10 integers chosen from the range 1 to 10 are:");
        for (int i = 0; i < 3; i++)
            System.out.println( makeRandomInts(10,10) );
        System.out.println();
        System.out.println("25 integers chosen from the range 1 to 10000 are :");
        System.out.println( makeRandomInts(25,10000) );
        System.out.println();
        System.out.println("This ended with an exception!");
        makeRandomInts(10,9);
    }

}



