package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.OddOrEven;
import org.junit.Test;

public class OddOrEvenTest {
    @Test
    public void exampleTest() {
        Assert.assertEquals("odd", OddOrEven.oddOrEven(new int[] {2, 5, 34, 6}));
    }
}