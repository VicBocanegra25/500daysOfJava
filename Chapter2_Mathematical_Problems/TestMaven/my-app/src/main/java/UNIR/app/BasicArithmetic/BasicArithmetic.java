package UNIR.app.BasicArithmetic;
/*The following class implements the methods from exercise 1 (1a: Basic Operations, 1b: Statistics, 1c: Even or Odd) */

// Importing the necessary packages
// Importing the ArrayList class to store the list of natural numbers
import java.util.ArrayList;
// HashSet to remove duplicates
import java.util.HashSet;
// Set to store the numbers without duplicates
import java.util.Set;
// Importing the Result class to store the sum and length of the list
import UNIR.app.BasicArithmetic.Result;

// Creating the class BasicArithmetic
public class BasicArithmetic{
    // Creating the constructors for our BasicArithmetic class, which will contain the methods for each sub-exercise
    public BasicArithmetic() {
    }

    /**
     * Write a method int calc(int, int) that multiplies two variables, m and n of type int,
     * then divides the product by two, and outputs the remainder with respect to division by 7.
     */
    public int calc(int m, int n) {
        // Returning the remainder of the division of the product of m and n by 2
        return ((m * n)/2) % 7;
    }

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

    /**
     * Create the methods boolean isEven(n) and boolean isOdd(n) that will check if the
     * passed integer is even or odd, respectively..*/

// Two simple methods that use the modulo operator to check if the number is even or odd.
    public boolean isEven(int n){
        return n % 2 == 0;
    }
    public boolean isOdd(int n){
        return n % 2 != 0;
    }

}