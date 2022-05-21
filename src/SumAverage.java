/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {
    private static int sum;

    /**
     * Computes sum of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return sum of integers
     */
    public static int sum(int lowerBound, int upperBound) {
        sum = 0;
        if (lowerBound <= upperBound) {
            for (int i = lowerBound; i <= upperBound; i++) {
                sum += i;
            }
            return sum;
        } else {
            return 0;
        }
    }

    /**
     * Computes sum of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return sum of integers
     */
    public static int sum(int[] numbers) {
        sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }

    /**
     * Computes average of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return average of integers
     */
    public static double average(int lowerBound, int upperBound) {
        sum = 0;
        int count = 0;
        while (lowerBound <= upperBound) {
            sum += lowerBound;
            lowerBound++;
            count++;
        }
        return (double) sum / count;
    }

    /**
     * Computes average of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return average of integers
     */
    public static double average(int[] numbers) {

        // TODO fill in code here using do-while loop and replace the return statement
        sum = 0;
        int i = 0;
        do {
            sum += numbers[i];
            i++;
        } while (i < numbers.length);
        return (double) sum / numbers.length;
    }
}