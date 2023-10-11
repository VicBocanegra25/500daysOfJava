package UNIR.app.PrimeNumbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class PrimeNumbersTest {

    // Creating an instance of the class PrimeNumbers
    private PrimeNumbers evaluate;

    /**
     * This method is executed before each test method to initialize common objects
     */
    @BeforeEach
    public void setUp() {
        evaluate = new PrimeNumbers(); // Initialize before each test method
    }

    /**
     * Provides test cases for prime number evaluation.
     */
    private static Stream<Object[]> primeNumbersTestCases() {
        return Stream.of(
                new Object[]{50, Arrays.asList(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47)},
                new Object[]{25, Arrays.asList(2,3,5,7,11,13,17,19,23)},
                new Object[]{15, Arrays.asList(2,3,5,7,11,13)}
        );
    }

    @ParameterizedTest
    @MethodSource("primeNumbersTestCases")
    public void testPrimeNumbers(int num_, List <Integer> expectedPrimeNumbers_) {
        // We first create our list of prime numbers using our method calcPrimeNumbersUpTo
        ArrayList<Integer> candidatePrimeNumbers = evaluate.calcPrimesUpTo(num_);
        // Then we compare the candidates with the expected lists
        assertEquals(expectedPrimeNumbers_, candidatePrimeNumbers, "The list of prime numbers is incorrect.");
    }

}
