package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.CodeWars;
import org.junit.Test;

public class CodeWarsTest {
    @Test
    public void testSomething() {
        Assert.assertEquals(1, CodeWars.strCount("o", 'o'));
        Assert.assertEquals(2, CodeWars.strCount("Hello", 'l'));
        Assert.assertEquals(0, CodeWars.strCount("", 'z'));
    }

}