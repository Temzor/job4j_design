package codewars;

import codewars.TipCalculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class TipCalculatorTest {
    @Test
    public void test1() {
        assertEquals(2, TipCalculator.calculateTip(30d, "poor"));
    }

    @Test
    public void test2() {
        assertEquals(4, TipCalculator.calculateTip(20d, "Excellent"));
    }

    @Test
    public void test4() {
        assertEquals(17, TipCalculator.calculateTip(107.65, "GReat"));
    }

}