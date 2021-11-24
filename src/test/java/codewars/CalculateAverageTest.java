package codewars;

import codewars.CalculateAverage;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateAverageTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testSomething() {
        assertEquals(1, CalculateAverage.findAverage(new int[]{1, 1, 1}), DELTA);
        assertEquals(2, CalculateAverage.findAverage(new int[]{1, 2, 3}), DELTA);
    }

}