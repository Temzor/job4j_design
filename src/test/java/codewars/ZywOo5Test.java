package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.ZywOo5;
import org.junit.Test;

public class ZywOo5Test {
    @Test
    public void basicTests() {
        Assert.assertEquals(9, ZywOo5.sumOfDifferences(new int[]{1, 2, 10}));
        Assert.assertEquals(2, ZywOo5.sumOfDifferences(new int[]{-3, -2, -1}));
        Assert.assertEquals(0, ZywOo5.sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
        Assert.assertEquals(34, ZywOo5.sumOfDifferences(new int[]{-17, 17}));
        Assert.assertEquals(0, ZywOo5.sumOfDifferences(new int[0]));
        Assert.assertEquals(0, ZywOo5.sumOfDifferences(new int[]{0}));
        Assert.assertEquals(0, ZywOo5.sumOfDifferences(new int[]{-1}));
        Assert.assertEquals(0, ZywOo5.sumOfDifferences(new int[]{1}));
    }

}