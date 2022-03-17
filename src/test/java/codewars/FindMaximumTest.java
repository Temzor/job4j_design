package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.FindMaximum;
import org.junit.Test;

public class FindMaximumTest {
    @Test
    public void testExamples() {
        Assert.assertEquals(-110, FindMaximum.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        Assert.assertEquals(0, FindMaximum.min(new int[]{42, 54, 65, 87, 0}));
        Assert.assertEquals(566, FindMaximum.max(new int[]{4, 6, 2, 1, 9, 63, -134, 566}));
        Assert.assertEquals(5, FindMaximum.max(new int[]{5}));
    }

}