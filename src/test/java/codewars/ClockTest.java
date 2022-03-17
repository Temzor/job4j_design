package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Clock;
import org.junit.Test;

public class ClockTest {
    @Test
    public void test1() {
        Assert.assertEquals(61000, Clock.past(0, 1, 1));
    }
}