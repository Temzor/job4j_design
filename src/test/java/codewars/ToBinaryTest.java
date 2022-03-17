package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.ToBinary;
import org.junit.Test;

public class ToBinaryTest {
    @Test
    public void testToBinary() {
        Assert.assertEquals(1, ToBinary.toBinary(1));
        Assert.assertEquals(10, ToBinary.toBinary(2));
        Assert.assertEquals(11, ToBinary.toBinary(3));
        Assert.assertEquals(101, ToBinary.toBinary(5));
    }

}