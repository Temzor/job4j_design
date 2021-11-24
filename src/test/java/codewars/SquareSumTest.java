package codewars;

import codewars.SquareSum;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareSumTest {
    @Test
    public void testBasic() {
        assertEquals(9, SquareSum.squareSum(new int[] {1, 2, 2}));
        assertEquals(5, SquareSum.squareSum(new int[] {1, 2}));
        assertEquals(50, SquareSum.squareSum(new int[] {5, -3, 4}));
    }

}