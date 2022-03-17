package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.ReturningStrings;
import org.junit.Test;

public class ReturningStringsTest {
    @Test
    public void testSomething() {
        Assert.assertEquals("Hello, Ryan how are you doing today?", ReturningStrings.greet("Ryan"));
    }

}