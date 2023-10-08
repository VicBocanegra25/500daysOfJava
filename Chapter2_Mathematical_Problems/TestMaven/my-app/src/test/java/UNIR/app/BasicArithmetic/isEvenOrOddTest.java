package UNIR.app.BasicArithmetic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class isEvenOrOddTest {

    private BasicArithmetic evaluate; // Instance variable to be reused in test methods

    /**
     * This method is executed before each test method to initialize common objects
     */
    @BeforeEach
    public void setUp() {
        evaluate = new BasicArithmetic(); // Initialize before each test method
    }

    /**
     * Test various cases in separate lines for readability
     */
    @Test
    public void testIsEven() {
        assertTrue(evaluate.isEven(6));
        assertTrue(evaluate.isEven(8));
        assertTrue(evaluate.isEven(-6));
        assertTrue(evaluate.isEven(0));
    }

    @Test
    public void testIsOdd() {
        assertTrue(evaluate.isOdd(7));
    }

    @Test
    public void testIsNotEven() {
        assertFalse(evaluate.isEven(7));
    }

    @Test
    public void testIsNotOdd() {
        assertFalse(evaluate.isOdd(6));
        assertFalse(evaluate.isOdd(8));
    }
}
