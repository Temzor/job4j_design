package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Bob;
import org.junit.Test;

public class BobTest {
    @Test
    public void testBob() {
        Assert.assertEquals("Should return 0.", 0, Bob.enough(10, 5, 5));
        Assert.assertEquals("Should return 10.", 10, Bob.enough(100, 60, 50));
        Assert.assertEquals("Should return 0.", 0, Bob.enough(20, 5, 5));
    }
}