package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.NthPower;
import org.junit.Test;

public class NthPowerTest {
    @Test
    public void basicTests() {
        Assert.assertEquals(-1, NthPower.nthPower(new int[] {1, 2}, 2));
        Assert.assertEquals(8, NthPower.nthPower(new int[] {3, 1, 2, 2}, 3));
        Assert.assertEquals(4, NthPower.nthPower(new int[] {3, 1, 2}, 2));
    }

}