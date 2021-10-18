package codewars;

import codewars.HalvingSum;
import org.junit.Test;

import static org.junit.Assert.*;

public class HalvingSumTest {
    @Test
    public void test() {
        assertEquals(47, HalvingSum.halvingSum(25));
        assertEquals(247, HalvingSum.halvingSum(127));
        assertEquals(17332, HalvingSum.halvingSum(8670));
        assertEquals(73, HalvingSum.halvingSum(38));
    }
}