package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.ReplaceDots;
import org.junit.Test;

public class ReplaceDotsTest {
    @Test
    public void testSomeDots() {
        Assert.assertEquals("Sorry, try again :-(", "one-two-three", ReplaceDots.replaceDots("one.two.three"));
    }

}