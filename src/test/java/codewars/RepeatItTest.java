package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.RepeatIt;
import org.junit.Test;

public class RepeatItTest {
    @Test
    public void testStar() {
        repeatTest("*", 3, "***");
    }

    @Test
    public void testHello() {
        repeatTest("Hello", 11, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello");
    }

    public void repeatTest(final Object toRepeat, final int n, final String expected) {
        final String testMessage = String.format("Testing with toRepeat = %s and n = %d", toRepeat, n);
        Assert.assertEquals(testMessage,  expected, RepeatIt.repeatString(toRepeat, n));
    }

}