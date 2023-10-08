package BasicArithmetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest{

    @Test
    public void testCalc() {
        Calc calc = new Calc();
        assertEquals(0, calc.calc(6, 7));
        assertEquals(6, calc.calc(3, 4));
        assertEquals(5, calc.calc(5, 5));
    }
}