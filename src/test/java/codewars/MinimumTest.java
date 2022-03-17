package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Minimum;
import org.junit.Test;

public class MinimumTest {
    @Test
    public void testSomething() {
        Assert.assertEquals(13, Minimum.minValue(new int[] {1, 3, 1}));
        Assert.assertEquals(457, Minimum.minValue(new int[] {4, 7, 5, 7}));
        Assert.assertEquals(148, Minimum.minValue(new int[] {4, 8, 1, 4}));
        Assert.assertEquals(579, Minimum.minValue(new int[] {5, 7, 9, 5, 7}));
        Assert.assertEquals(678, Minimum.minValue(new int[] {6, 7, 8, 7, 6, 6}));
        Assert.assertEquals(134679, Minimum.minValue(new int[] {1, 9, 3, 1, 7, 4, 6, 6, 7}));
    }
}