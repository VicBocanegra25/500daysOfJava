package chapter02.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
 * Find the number as well as the sum of natural numbers, which are divisible by 2 or 7 up
to a given maximum value (exclusive) and output it to the console. Write method void
calcSumAndCountAllNumbersDivBy_2_Or_7(int). Extend it so that it returns the two
values instead of performing the console output.
 */
public class Exercise1bStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calling the method with some values. 
		calcSumAndCountAllNumbersDivBy_2_Or_7(3);
		calcSumAndCountAllNumbersDivBy_2_Or_7(8);
		calcSumAndCountAllNumbersDivBy_2_Or_7(15);
		
		int[] results1 = calcSumAndCountAllNumbersDivBy_2_Or_7(3l);
		int[] results2 = calcSumAndCountAllNumbersDivBy_2_Or_7(8l);
		int[] results3 = calcSumAndCountAllNumbersDivBy_2_Or_7(15l);
		
		System.out.println("\nNow using the return values");
		System.out.println(results1[0] + " " + results1[1]);
		System.out.println(results2[0] + " " + results2[1]);
		System.out.println(results3[0] + " " + results3[1]);

		
	}

	public static void calcSumAndCountAllNumbersDivBy_2_Or_7(int number) {
		List<Integer> divisibleByTwoOrSeven = new ArrayList<Integer>();
		for (int i = 1; i < number; i++) {
			if (i % 2 == 0 || i % 7 == 0) {
				divisibleByTwoOrSeven.add(i);
			}
		}
		// Casting the ArrayList to int[]
		
		Integer count = (int) divisibleByTwoOrSeven.stream().count();
		Integer sum = (int) divisibleByTwoOrSeven.stream().reduce(0, (a, b) -> a+b);
		System.out.println("Result count is: " + count);
		System.out.println("Sum is: " + sum);
	}
	
	// Extending the method to return the results
	public static int[] calcSumAndCountAllNumbersDivBy_2_Or_7(long number) {
		int[] results = new int[2];
		List<Integer> divisibleByTwoOrSeven = new ArrayList<Integer>();
		for (int i = 1; i < number; i++) {
			if (i % 2 == 0 || i % 7 == 0) {
				divisibleByTwoOrSeven.add(i);
			}
		}
		// Casting the ArrayList to int[]
		
		results[0] = (int) divisibleByTwoOrSeven.stream().count();
		results[1] = (int) divisibleByTwoOrSeven.stream().reduce(0, (a, b) -> a+b);
		return results;
	}
}
