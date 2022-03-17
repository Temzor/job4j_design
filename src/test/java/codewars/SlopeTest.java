package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Slope;
import org.junit.Test;

public class SlopeTest {
    @Test
    public void test1() {
        int[] test1 = {19, 3, 20, 3};
        Slope s = new Slope();
        Assert.assertEquals("0", s.slope(test1));

        Assert.assertEquals("undefined", s.slope(new int[]{-7, 2, -7, 4}));
        Assert.assertEquals("5", s.slope(new int[]{10, 50, 30, 150}));
        Assert.assertEquals("-5", s.slope(new int[]{15, 45, 12, 60}));
        Assert.assertEquals("6", s.slope(new int[]{10, 20, 20, 80}));
        Assert.assertEquals("undefined", s.slope(new int[]{-10, 6, -10, 3}));
    }
}