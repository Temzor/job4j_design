package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.NumberToString;
import org.junit.Test;

public class NumberToStringTest {
    @Test
    public void tests() {
        Assert.assertEquals("67", NumberToString.numberToString(67));
        Assert.assertEquals("123", NumberToString.numberToString(123));
        Assert.assertEquals("999", NumberToString.numberToString(999));
    }

}