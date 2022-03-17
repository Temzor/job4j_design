package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.DigPow;
import org.junit.Test;

public class DigPowTest {
    @Test
    public void test1() {
        Assert.assertEquals(1, DigPow.digPow(89, 1));
    }
    @Test
    public void test2() {
        Assert.assertEquals(-1, DigPow.digPow(92, 1));
    }
}