package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Well;
import org.junit.Test;

public class WellTest {
    @Test
    public void basicTests() {
        Assert.assertEquals("Fail!", Well.well(new String[] {"bad", "bad", "bad"}));
        Assert.assertEquals("Publish!", Well.well(new String[] {"good", "bad", "bad", "bad", "bad"}));
        Assert.assertEquals("I smell a series!", Well.well(new String[] {
                "good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
    }

}