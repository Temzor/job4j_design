package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.FakeBinary;
import org.junit.Test;

public class FakeBinaryTest {
    @Test
    public void testSomething() {
        Assert.assertEquals("01011110001100111", FakeBinary.fakeBin("45385593107843568"));
        Assert.assertEquals("101000111101101", FakeBinary.fakeBin("509321967506747"));
        Assert.assertEquals("011011110000101010000011011",
                FakeBinary.fakeBin("366058562030849490134388085"));
        Assert.assertEquals("", FakeBinary.fakeBin(""));
    }

}