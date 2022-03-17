package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Chocolate;
import org.junit.Test;

public class ChocolateTest {
    @Test
    public void myTests() {
        Assert.assertEquals(24, Chocolate.breakChocolate(5, 5));
        Assert.assertEquals(0, Chocolate.breakChocolate(1, 1));
    }
}