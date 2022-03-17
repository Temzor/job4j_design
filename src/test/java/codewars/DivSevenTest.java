package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.DivSeven;
import org.junit.Test;

public class DivSevenTest {
    @Test
    public void test1() {
        System.out.println("Basic Tests");
        Assert.assertArrayEquals(new long[] {7, 2}, DivSeven.seven(1603));
        Assert.assertArrayEquals(new long[] {35, 1}, DivSeven.seven(371));
        Assert.assertArrayEquals(new long[] {42, 1}, DivSeven.seven(483));
    }

}