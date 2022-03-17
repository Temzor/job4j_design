package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.HalvingSum;
import org.junit.Test;

public class HalvingSumTest {
    @Test
    public void test() {
        Assert.assertEquals(47, HalvingSum.halvingSum(25));
        Assert.assertEquals(247, HalvingSum.halvingSum(127));
        Assert.assertEquals(17332, HalvingSum.halvingSum(8670));
        Assert.assertEquals(73, HalvingSum.halvingSum(38));
    }
}