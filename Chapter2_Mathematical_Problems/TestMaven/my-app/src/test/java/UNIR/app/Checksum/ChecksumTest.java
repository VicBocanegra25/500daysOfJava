package UNIR.app.Checksum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Testing our Checksum class to ensure the algorithm is correct
 * */

public class ChecksumTest {

    // Creating an instance of Checksum to use for test evaluations
    private Checksum evaluate;

    /**
     * Initialize common test objects. This method is executed before each test method.
     */
    @BeforeEach
    public void setUp() {
        // Initialize before each test method
        evaluate = new Checksum();
    }

    /**
     * A Stream of Arguments that pairs test input with expected outputs.
     * Used to supply arguments to our parameterized tests.
     * @return Stream of Arguments
     */
    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of("11111", 5),
                Arguments.of("87654321", 0)
        );
    }

    /**
     * Parameterized test for the calcChecksum method.
     * Uses the provideTestCases method to obtain test cases
     * @param input String for calcChecksum
     * @param expectedOutput: int expected output
     */
    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testCalcChecksum(String input, int expectedOutput) {
        assertEquals(expectedOutput, evaluate.calcChecksum(input), String.format("The checksum for %s is incorrect.", input));
    }
}