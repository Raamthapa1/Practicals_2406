public class StatCalc5 {

    private int count;   // Number of numbers that have been entered.
    private double sum;  // The sum of all the items that have been entered.
    private double SumOfSquare;  // The sum of the squares of all the items.
    private double max = Double.NEGATIVE_INFINITY;  // Largest item seen.
    private double min = Double.POSITIVE_INFINITY;  // Smallest item seen.

    /**
     * Add a number to the dataset.  The statistics will be computed for all
     * the numbers that have been added to the dataset using this method.
     */
    public void enter(double num) {
        count++;
        sum += num;
        SumOfSquare += num*num;
        if (num > max)
            max = num;
        if (num < min)
            min = num;
    }

    /**
     * Return the number of items that have been entered into the dataset.
     */
    public int getCount() {
        return count;
    }

    /**
     * Return the sum of all the numbers that have been entered.
     */
    public double getSum() {
        return sum;
    }

    /**
     * Return the average of all the items that have been entered.
     * The return value is Double.NaN if no numbers have been entered.
     */
    public double getMean() {
        return sum / count;
    }

    /**
     * Return the standard deviation of all the items that have been entered.
     * The return value is Double.NaN if no numbers have been entered.
     */
    public double getStandardDeviation() {
        double mean = getMean();
        return Math.sqrt( SumOfSquare /count - mean*mean );
    }


    public double getMin() {
        return min;
    }


    public double getMax() {
        return max;
    }

}
