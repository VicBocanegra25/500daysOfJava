package UNIR.app.PerfectNumbers;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class PerfectNumbers {
    /**
     * Write method List<Integer> calcPerfectNumbers(int) that calculates the perfect
     * numbers up to a maximum value, say 10,000. A number is perfect if the sum of its divisors.
     * */
    public List<Integer> calcPerfNumbers(int num_) {
        // Creating an Array List to store our perfect numbers
        ArrayList< Integer > perfNumbers = new ArrayList<>();
        // Looping through the numbers from 1 to num_
        for (int i = 1; i <= num_; i++) {
            // Create a variable to store the divisors in i
            List< Integer > divisors = findProperDivisors(i);
            int sum = divisors.stream().mapToInt(Integer::intValue).sum();

            // Comparing the value of sum, with i
            if (i == sum) {
                perfNumbers.add(i);
            }
        }
        return perfNumbers;
    }

    /**
     * Auxiliary method to find proper divisors in a number
     * */
    public static List<Integer> findProperDivisors ( final int value_)
    {
        final List< Integer > divisors = new ArrayList<>();
        // looping through the numbers from 1 to value_/2
        for (int i = 1; i <= value_ / 2; i++) {
            if (value_ % i == 0) {
                divisors.add(i);
            }
        }

        return divisors;
    }

    public static void main(String[] args) {
        PerfectNumbers evaluate = new PerfectNumbers();
        List<Integer> candidatePerfectNumbers = evaluate.calcPerfNumbers(1000);
        List<Integer> expectedPerfectNumbers = Arrays.asList(6, 28, 496);
        System.out.println(candidatePerfectNumbers);
        System.out.println(expectedPerfectNumbers);
    }
}


