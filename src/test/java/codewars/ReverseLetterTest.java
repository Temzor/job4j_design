package codewars;

import org.testng.Assert;
import ru.codewars.eightkyu.ReverseLetter;
import org.junit.Test;

public class ReverseLetterTest {
    @Test
    public void testSomething() {
        doTest("krishan", "nahsirk");
        doTest("ultr53o?n", "nortlu");
        doTest("ab23c", "cba");
        doTest("krish21an", "nahsirk");
    }
    private void doTest(final String str, final String expected) {
        Assert.assertEquals(expected, ReverseLetter.reverseLetter(str));
    }
}