package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.TipCalculator;
import org.junit.Test;

public class TipCalculatorTest {
    @Test
    public void test1() {
        Assert.assertEquals(2, TipCalculator.calculateTip(30d, "poor"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(4, TipCalculator.calculateTip(20d, "Excellent"));
    }

    @Test
    public void test4() {
        Assert.assertEquals(17, TipCalculator.calculateTip(107.65, "GReat"));
    }

}