package Statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcSumAndCountAllNumbersDivBy_2_Or_7Test {

    @Test
    public void testCalcSumAndCountAllNumbersDivBy_2_Or_7_Tuple() {
        CalcSumAndCountAllNumbersDivBy_2_Or_7 calc = new CalcSumAndCountAllNumbersDivBy_2_Or_7();
        Result result = calc.calcSumAndCountAllNumbersDivBy_2_Or_7_Tuple(15);
        Result result2 = calc.calcSumAndCountAllNumbersDivBy_2_Or_7_Tuple(8);
        Result result3 = calc.calcSumAndCountAllNumbersDivBy_2_Or_7_Tuple(3);

        // Check if the sum and length are correct
        assertEquals(63, result.getSum()); // 63 is correct
        assertEquals(8, result.getLength());

        assertEquals(19, result2.getSum());
        assertEquals(4, result2.getLength());

        assertEquals(2, result3.getSum());
        assertEquals(1, result3.getLength());

    }

}