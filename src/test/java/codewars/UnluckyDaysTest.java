package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.UnluckyDays;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnluckyDaysTest {
    @Test
    public void testSomething() {
        Assert.assertEquals(3, UnluckyDays.unluckyDays(2015));
        Assert.assertEquals(1, UnluckyDays.unluckyDays(1986));
    }

}