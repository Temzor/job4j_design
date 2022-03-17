package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.SquareSum;
import org.junit.Test;

public class SquareSumTest {
    @Test
    public void testBasic() {
        Assert.assertEquals(9, SquareSum.squareSum(new int[] {1, 2, 2}));
        Assert.assertEquals(5, SquareSum.squareSum(new int[] {1, 2}));
        Assert.assertEquals(50, SquareSum.squareSum(new int[] {5, -3, 4}));
    }

}