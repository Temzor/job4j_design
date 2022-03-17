package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.ReverseNumber;
import org.junit.Test;

public class ReverseNumberTest {
    @Test
    public void reverse() {
        Assert.assertEquals(321, ReverseNumber.reverse(123));
        Assert.assertEquals(-321, ReverseNumber.reverse(-123));
        Assert.assertEquals(1, ReverseNumber.reverse(1000));
        Assert.assertEquals(4321234, ReverseNumber.reverse(4321234));
        Assert.assertEquals(5, ReverseNumber.reverse(5));
        Assert.assertEquals(89898989, ReverseNumber.reverse(98989898));

    }
}