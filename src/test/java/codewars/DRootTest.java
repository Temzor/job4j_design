package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.DRoot;
import org.junit.Test;

public class DRootTest {
    @Test
    public void test1() {
        Assert.assertEquals("Nope!", 7, DRoot.digitalRoot(16));
    }
    @Test
    public void test2() {
        Assert.assertEquals("Nope!", 6, DRoot.digitalRoot(456));
    }
}