package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.StrongNumber;
import org.junit.Test;

public class StrongNumberTest {
    final static String STRONG = "STRONG!!!!";
    final static String NOT_STRONG = "Not Strong !!";

    @Test
    public void testSomething() {
        Assert.assertEquals(STRONG, StrongNumber.isStrongNumber(1));
        Assert.assertEquals(STRONG, StrongNumber.isStrongNumber(2));
        Assert.assertEquals(STRONG, StrongNumber.isStrongNumber(145));
        Assert.assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(7));
        Assert.assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(93));
        Assert.assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(185));
    }

}