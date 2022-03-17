package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.WideMouthedFrog;
import org.junit.Test;

public class WideMouthedFrogTest {
    @Test
    public void fixedTests() {
        Assert.assertEquals("wide", WideMouthedFrog.mouthSize("toucan"));
        Assert.assertEquals("wide", WideMouthedFrog.mouthSize("ant bear"));
        Assert.assertEquals("small", WideMouthedFrog.mouthSize("alligator"));
    }
}