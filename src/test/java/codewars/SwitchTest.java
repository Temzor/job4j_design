package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Switch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwitchTest {
    @Test
    public void testSomething() {
        Assert.assertEquals("abc", Switch.switcheroo("bac"));
        Assert.assertEquals("ccc", Switch.switcheroo("ccc"));
        Assert.assertEquals("aaabcccbaaa", Switch.switcheroo("bbbacccabbb"));
    }

}