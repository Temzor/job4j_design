package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Repeater;
import org.junit.Test;

public class RepeaterTest {
    @Test
    public void testSomething() {
        Assert.assertEquals("aaaaa", Repeater.repeat("a", 5));
        Assert.assertEquals("NaNaNaNaNaNaNaNaNaNaNaNaNaNaNaNa", Repeater.repeat("Na", 16));
        Assert.assertEquals("Wub Wub Wub Wub Wub Wub ", Repeater.repeat("Wub ", 6));
    }

}