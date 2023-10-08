package UNIR.app.PerfectNumbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class NumbersAsTextTest {

    // Declaring an instance of our numbersAsText class
    private PerfectNumbers evaluate;

    /**
     * This method is executed before each test method to initialize common objects
     */
    @BeforeEach
    public void setUp() {
        evaluate = new PerfectNumbers();
    }

    /**
     * Provides test cases for perfect number evaluation.
     */
    private static Stream<Object[]> perfectNumberTestCases() {
        return Stream.of(
                new Object[]{1000, Arrays.asList(6, 28, 496)},
                new Object[]{10000, Arrays.asList(6, 28, 496, 8128)}
        );
    }

    /**
     * Testing for perfect numbers and non-perfect numbers in separate cases.
     */
    @ParameterizedTest
    @MethodSource("perfectNumberTestCases")
    public void testPerfectNumbers(int num_, List <Integer> expectedPerfectNumbers_) {
        List<Integer> candidatePerfectNumbers = evaluate.calcPerfNumbers(num_);
        assertEquals(expectedPerfectNumbers_, candidatePerfectNumbers, "The list of perfect numbers is incorrect.");
    }

}
