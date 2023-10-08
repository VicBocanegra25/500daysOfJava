package UNIR.app.NumbersAsText;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex_02_NumbersAsTextTest {

    private NumbersAsText numbersAsText; // Declare an instance variable for the NumbersAsText class

    @BeforeEach
    public void setUp() {
        numbersAsText = new NumbersAsText(); // Initialize it once for all test methods
    }

    @Test
    public void testNumberAsText() {
        // Test various cases in separate lines for readability
        assertEquals("FOUR TWO", numbersAsText.numberAsText(42));
        assertEquals("TWO FOUR SIX EIGHT ZERO", numbersAsText.numberAsText(24680));
        assertEquals("ONE THREE FIVE SEVEN NINE", numbersAsText.numberAsText(13579));
    }
}
