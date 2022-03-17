package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.HelpAlex;
import org.junit.Test;

public class HelpAlexTest {
    @Test
    public void testHoopCount() {
        Assert.assertEquals("Great, now move on to tricks", HelpAlex.hoopCount(11));
        Assert.assertEquals("Keep at it until you get it", HelpAlex.hoopCount(7));
    }

}