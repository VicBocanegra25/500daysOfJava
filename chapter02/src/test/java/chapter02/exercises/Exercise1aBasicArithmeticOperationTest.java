package chapter02.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Exercise1aBasicArithmeticOperationTest {

	// Allows us to execute the tests multiple times with diferent parameters
    @ParameterizedTest
    // The parameters are passed as strings: m = 6, n = 7, expected = 0...
    @CsvSource({ "6, 7, 0", 
		      	 "3, 4, 6", 
		    	 "5, 5, 5" 
		       })
    void calc(int m, int n, int expected)
    {
    	// Every time the test is run, the result is calculated with the different parameters
        int result = Exercise1aBasicArithmeticOperation.calc(m, n);

        assertEquals(expected, result);
    }
}
