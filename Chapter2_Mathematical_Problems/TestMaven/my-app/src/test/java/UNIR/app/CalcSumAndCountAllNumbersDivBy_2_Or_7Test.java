package UNIR.app.BasicArithmetic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcSumAndCountAllNumbersDivBy_2_Or_7Test {

    @Test
    public void testCalcSumAndCountAllNumbersDivBy_2_Or_7_Tuple() {
        BasicArithmetic evaluate = new BasicArithmetic();

        // Test case 1
        Result result1 = evaluate.calcSumAndCountAllNumbersDivBy_2_Or_7_Tuple(15);
        assertAll("TestCase1 - Check sum and length",
                () -> assertEquals(63, result1.getSum()),
                () -> assertEquals(8, result1.getLength())
        );

        // Test case 2
        Result result2 = evaluate.calcSumAndCountAllNumbersDivBy_2_Or_7_Tuple(8);
        assertAll("TestCase2 - Check sum and length",
                () -> assertEquals(19, result2.getSum()),
                () -> assertEquals(4, result2.getLength())
        );

        // Test case 3
        Result result3 = evaluate.calcSumAndCountAllNumbersDivBy_2_Or_7_Tuple(3);
        assertAll("TestCase3 - Check sum and length",
                () -> assertEquals(2, result3.getSum()),
                () -> assertEquals(1, result3.getLength())
        );
    }
}
