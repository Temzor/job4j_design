package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.NthSeries;
import org.junit.Test;

public class NthSeriesTest {
    @Test
    public void test1() {
        Assert.assertEquals("1.57", NthSeries.seriesSum(5));
    }
    @Test
    public void test2() {
        Assert.assertEquals("1.77", NthSeries.seriesSum(9));
    }
    @Test
    public void test3() {
        Assert.assertEquals("1.94", NthSeries.seriesSum(15));
    }

}