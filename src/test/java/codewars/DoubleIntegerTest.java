package codewars;

import codewars.DoubleInteger;
import org.junit.Assert;
import org.junit.Test;

public class DoubleIntegerTest {
    @Test
    public final void testAll() {
        Assert.assertEquals("Nope!", 4, DoubleInteger.doubleInteger(2));
    }

}