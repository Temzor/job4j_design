package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.ReduceButGrow;
import org.junit.Test;

public class ReduceButGrowTest {
    @Test
    public void testSomething() {
        Assert.assertEquals(6, ReduceButGrow.grow(new int[]{1, 2, 3}));
        Assert.assertEquals(16, ReduceButGrow.grow(new int[]{4, 1, 1, 1, 4}));
        Assert.assertEquals(64, ReduceButGrow.grow(new int[]{2, 2, 2, 2, 2, 2}));
    }

}