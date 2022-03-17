package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.SumArray;
import org.junit.Test;

public class SumArrayTest {
    @Test
    public void testSum() {
        Assert.assertEquals(0,      SumArray.sum(new double[] {}),                1e-4);
        Assert.assertEquals(-2.398, SumArray.sum(new double[] {-2.398}),           1e-4);
        Assert.assertEquals(6,      SumArray.sum(new double[] {1, 2, 3}),          1e-4);
        Assert.assertEquals(6.6,    SumArray.sum(new double[] {1.1, 2.2, 3.3}),    1e-4);
        Assert.assertEquals(9.2,    SumArray.sum(new double[] {1, 5.2, 4, 0, -1}), 1e-4);
        Assert.assertEquals(320,    SumArray.sum(new double[] {30, 89, 100, 101}), 1e-4);
    }

}