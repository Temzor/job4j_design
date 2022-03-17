package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.HighAndLow;
import org.junit.Test;

public class HighAndLowTest {
    @Test
    public void test1() {
        Assert.assertEquals("42 -9", HighAndLow.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

}