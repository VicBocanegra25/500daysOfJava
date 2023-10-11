package UNIR.app.PrimeNumberPairs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeNumberPairsTest {

    private PrimeNumberPairs evaluate;

    @BeforeEach
    public void setUp() {
        evaluate = new PrimeNumberPairs();
    }

    private static Stream<TestData> primeNumbersTestCases() {
        return Stream.of(
                new TestData(50,
                        new ArrayList<>(Arrays.asList(3, 5, 5, 7, 11, 13, 17, 19, 29, 31, 41, 43)),
                        new ArrayList<>(Arrays.asList(3, 7, 7, 11, 13, 17, 19, 23, 37, 41, 43, 47)),
                        new ArrayList<>(Arrays.asList(5, 11, 7,13, 11,17,13, 19, 17, 23, 23, 29, 31, 37, 37,43, 41, 47))),
                new TestData(25,
                        new ArrayList<>(Arrays.asList(3, 5, 5, 7, 11, 13, 17, 19)),
                        new ArrayList<>(Arrays.asList(3, 7, 7, 11, 13, 17, 19, 23)),
                        new ArrayList<>(Arrays.asList(5, 11, 7,13, 11,17,13, 19, 17, 23)))
        );
    }


    @ParameterizedTest
    @MethodSource("primeNumbersTestCases")
    public void testFindPairCousinSexyPrimes(TestData testData) {
        ResultPrimes resultPrimes = evaluate.findPairCousinSexyPrimes(testData.limit);
        assertEquals(testData.expectedTwinPrimes, resultPrimes.getTwinPrimes());
        assertEquals(testData.expectedCousinPrimes, resultPrimes.getCousinPrimes());
        assertEquals(testData.expectedSexyPrimes, resultPrimes.getSexyPrimes());
    }

    private static class TestData {
        int limit;
        ArrayList<Integer> expectedTwinPrimes;
        ArrayList<Integer> expectedCousinPrimes;
        ArrayList<Integer> expectedSexyPrimes;

        TestData(int limit, ArrayList<Integer> expectedTwinPrimes, ArrayList<Integer> expectedCousinPrimes, ArrayList<Integer> expectedSexyPrimes) {
            this.limit = limit;
            this.expectedTwinPrimes = expectedTwinPrimes;
            this.expectedCousinPrimes = expectedCousinPrimes;
            this.expectedSexyPrimes = expectedSexyPrimes;
        }
    }
}
