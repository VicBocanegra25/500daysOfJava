package BasicArithmetic;/*Find the number as well as the sum of natural numbers, which are divisible by 2 or 7 up
to a given maximum value (exclusive) and output it to the console. Write method void
calcSumAndCountAllNumbersDivBy_2_Or_7(int). Extend it so that it returns the two
values instead of performing the console output.
*/

// Importing the ArrayList class to store the list of natural numbers
import java.util.ArrayList;
// HashSet to remove duplicates
import java.util.HashSet;
// Set to store the numbers without duplicates
import java.util.Set;

public class CalcSumAndCountAllNumbersDivBy_2_Or_7 {

    /**
     * This method finds the number as well as the sum of natural numbers, which are divisible by 2 or 7 up
     * to a given maximum value (exclusive), and outputs it to the console.
     * @param max_ int
     * @return void
     */
    public void calcSumAndCountAllNumbersDivBy_2_Or_7(int max_){

        // Creating an ArrayList to store the numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        // Creating a variable to store the sum of the numbers
        int sum = 0;
        // And a variable to store the length of the list
        int length;

        // Iterating through the numbers from 1 to max_(exclusive)
        for (int i = 1; i < max_; i++) {
            // Checking if the numbers are divisible by 2 or by 7
            if (i % 2 == 0 || i % 7 == 0){
                numbers.add(i);
            }
        }

        // Transforming the ArrayList into a Set to remove duplicates
        Set<Integer> numbersSet = new HashSet<>(numbers);

        // Getting the length of the Set
        length = numbersSet.size();

        // Adding the numbers in the Set
        for (Object number: numbersSet){
            sum += (int) number;
        }

        // Printing the length of the Set
        System.out.println("There are " + max_ + " natural number " + length);

        // Printing the sum of the numbers
        System.out.println("The sum of all natural numbers divisible by 2 and 7 from 1 to " + max_ + " is: " + sum);
    }

    /**
     * This method finds the number as well as the sum of natural numbers, which are divisible by 2 or 7 up
     * to a given maximum value (exclusive), and outputs it to the console.
     * @param max_ int
     * @return Result  // A Custom class that holds a tuple of the sum and length of the list
     */
    public Result calcSumAndCountAllNumbersDivBy_2_Or_7_Tuple(int max_){

        // Creating an ArrayList to store the numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        // Creating a variable to store the sum of the numbers
        int sum = 0;
        // And a variable to store the length of the list
        int length = 0;
        // And a Result object to store the sum and length of the list
        Result result = new Result(sum, length);

        // Iterating through the numbers from 1 to max_(exclusive)
        for (int i = 1; i < max_; i++) {
            // Checking if the numbers are divisible by 2 or by 7
            if (i % 2 == 0 || i % 7 == 0){
                numbers.add(i);
            }
        }

        // Transforming the ArrayList into a Set to remove duplicates
        Set<Integer> numbersSet = new HashSet<>(numbers);

        // Getting the length of the Set
        length = numbersSet.size();

        // Adding the numbers in the Set
        for (Object number: numbersSet){
            sum += (int) number;
        }

        // Using the setters to set the values of the Result object
        result.setSum(sum);
        result.setLength(length);

        // Returning the Result object
        return result;
    }
}
