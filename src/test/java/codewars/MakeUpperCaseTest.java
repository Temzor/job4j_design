package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.MakeUpperCase;
import org.junit.Test;

public class MakeUpperCaseTest {
    @Test
    public void testSomething() {
        Assert.assertEquals("HELLO", MakeUpperCase.makeUpperCase("hello"));
    }

}