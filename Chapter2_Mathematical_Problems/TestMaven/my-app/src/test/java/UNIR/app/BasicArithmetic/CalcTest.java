package UNIR.app.BasicArithmetic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest{

    // Instance variable to be reused in test methods
    private BasicArithmetic evaluate;

    /**
     * This method is executed before each test method to initialize common objects
     */
    @BeforeEach
    public void setUp() {
        evaluate = new BasicArithmetic(); // Initialize before each test method
    }

    @Test
    public void testCalc() {

        // Evaluating if the method calc() performs the operations correctly.
        assertEquals(0, evaluate.calc(6, 7));
        assertEquals(6, evaluate.calc(3, 4));
        assertEquals(5, evaluate.calc(5, 5));
    }
}