package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Calculate;
import org.junit.Test;

public class CalculateTest {
    @Test
    public void testBMI() {
        Assert.assertEquals("Normal", Calculate.bmi(80, 1.80));
    }

}