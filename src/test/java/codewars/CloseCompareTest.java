package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.CloseCompare;
import org.junit.Test;

public class CloseCompareTest {
    @Test
    public void exampleTestCases() {
        Assert.assertEquals(-1, CloseCompare.closeCompare(4, 5));
        Assert.assertEquals(0, CloseCompare.closeCompare(5, 5));
        Assert.assertEquals(1, CloseCompare.closeCompare(6, 5));
        Assert.assertEquals(-1, CloseCompare.closeCompare(-6, -5));

        Assert.assertEquals(0, CloseCompare.closeCompare(2, 5, 3));
        Assert.assertEquals(1, CloseCompare.closeCompare(8.1, 5, 3));
        Assert.assertEquals(-1, CloseCompare.closeCompare(1.99, 5, 3));
    }

}