package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.CalculateAverage;
import org.junit.Test;

public class CalculateAverageTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testSomething() {
        Assert.assertEquals(1, CalculateAverage.findAverage(new int[]{1, 1, 1}), DELTA);
        Assert.assertEquals(2, CalculateAverage.findAverage(new int[]{1, 2, 3}), DELTA);
    }

}