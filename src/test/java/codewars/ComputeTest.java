package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Compute;
import org.junit.Test;

public class ComputeTest {
    @Test
    public void testGcd() {
        Assert.assertEquals(6, Compute.compute(30, 12));
        Assert.assertEquals(1, Compute.compute(8, 9));
        Assert.assertEquals(1, Compute.compute(1, 1));
    }

}