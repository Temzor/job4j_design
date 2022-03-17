package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.MinSum;
import org.junit.Test;

public class MinSumTest {
    @Test
    public void basicTests() {
        Assert.assertEquals(22, MinSum.minSum(new int[]{5, 4, 2, 3}));
        Assert.assertEquals(342, MinSum.minSum(new int[]{12, 6, 10, 26, 3, 24}));
        Assert.assertEquals(74, MinSum.minSum(new int[]{9, 2, 8, 7, 5, 4, 0, 6}));
    }

}