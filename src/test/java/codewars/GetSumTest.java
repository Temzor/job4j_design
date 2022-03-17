package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.GetSum;
import org.junit.Test;

public class GetSumTest {
    GetSum s = new GetSum();

    @Test
    public void test1() {
        Assert.assertEquals(-1, s.getSum(0, -1));
        Assert.assertEquals(1, s.getSum(0, 1));
        Assert.assertEquals(1, s.getSum(1, 0));
        Assert.assertEquals(1, s.getSum(0, 1));
    }


}