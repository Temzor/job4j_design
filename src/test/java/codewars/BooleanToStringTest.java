package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.BooleanToString;
import org.junit.Test;

public class BooleanToStringTest {
    @Test
    public void testTrue() {
        Assert.assertEquals(BooleanToString.convert(true), "true");
    }

    @Test public void testFalse() {
        Assert.assertEquals(BooleanToString.convert(false), "false");
    }

}