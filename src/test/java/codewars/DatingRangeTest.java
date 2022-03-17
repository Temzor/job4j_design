package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.DatingRange;
import org.junit.Test;

public class DatingRangeTest {
    @Test
    public void exampleTests() {
        Assert.assertEquals("15-20", DatingRange.datingRange(17));
        Assert.assertEquals("27-66", DatingRange.datingRange(40));
        Assert.assertEquals("14-16", DatingRange.datingRange(15));
        Assert.assertEquals("24-56", DatingRange.datingRange(35));
        Assert.assertEquals("9-11", DatingRange.datingRange(10));
    }

}