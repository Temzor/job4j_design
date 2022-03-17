package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.EvenOrOdd;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EvenOrOddTest {
    @Test
    public void testEvenOrOdd() {
        Assert.assertEquals("Even", EvenOrOdd.ever(6));
        Assert.assertEquals("Odd", EvenOrOdd.ever(7));
    }
}