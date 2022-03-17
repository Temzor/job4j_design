package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Remove;
import org.junit.Test;

public class RemoveTest {
    @Test
    public void fixedTests() {
        Assert.assertEquals("Hi", Remove.remove("Hi!", 1));
        Assert.assertEquals("Hi", Remove.remove("Hi!", 100));
        Assert.assertEquals("Hi!!", Remove.remove("Hi!!!", 1));
        Assert.assertEquals("Hi", Remove.remove("Hi!!!", 100));
        Assert.assertEquals("Hi", Remove.remove("!Hi", 1));
        Assert.assertEquals("Hi!", Remove.remove("!Hi!", 1));
        Assert.assertEquals("Hi", Remove.remove("!Hi!", 100));
        Assert.assertEquals("!!Hi !!hi!!! !hi", Remove.remove("!!!Hi !!hi!!! !hi", 1));
        Assert.assertEquals("Hi !!hi!!! !hi", Remove.remove("!!!Hi !!hi!!! !hi", 3));
        Assert.assertEquals("Hi hi!!! !hi", Remove.remove("!!!Hi !!hi!!! !hi", 5));
        Assert.assertEquals("Hi hi hi", Remove.remove("!!!Hi !!hi!!! !hi", 100));
    }

}