package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.PowersOfTwo;
import org.junit.Test;

public class PowersOfTwoTest {
    @Test
    public void testSomething() {
        Assert.assertArrayEquals(new long[]{1}, PowersOfTwo.powersOfTwo(0));
        Assert.assertArrayEquals(new long[]{1, 2}, PowersOfTwo.powersOfTwo(1));
        Assert.assertArrayEquals(new long[]{1, 2, 4, 8, 16}, PowersOfTwo.powersOfTwo(4));
    }

}