package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.BalancedNum;
import org.junit.Test;

public class BalancedNumTest {
    @Test
    public void checkBalancedNumber() {
        Assert.assertEquals("Balanced", BalancedNum.balancedNum(7));
        Assert.assertEquals("Balanced", BalancedNum.balancedNum(959));
        Assert.assertEquals("Balanced", BalancedNum.balancedNum(13));
        Assert.assertEquals("Not Balanced", BalancedNum.balancedNum(432));
        Assert.assertEquals("Balanced", BalancedNum.balancedNum(424));
    }
    @Test
    public void checkLargerNumber() {
        Assert.assertEquals("Not Balanced", BalancedNum.balancedNum(1024));
        Assert.assertEquals("Not Balanced", BalancedNum.balancedNum(66545));
        Assert.assertEquals("Not Balanced", BalancedNum.balancedNum(295591));
        Assert.assertEquals("Not Balanced", BalancedNum.balancedNum(1230987));
        Assert.assertEquals("Balanced", BalancedNum.balancedNum(56239814));
    }

}