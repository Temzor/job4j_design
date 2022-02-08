package leetcode.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {
    @Test
    public void testOne() {
        SingleNumber singleNumber = new SingleNumber();
        int[] except = new int[] {2, 2, 1};
        assertEquals(1, singleNumber.singleNumber(except));
    }

    @Test
    public void testTwo() {
        SingleNumber singleNumber = new SingleNumber();
        int[] except = new int[] {4, 1, 2, 1, 2};
        assertEquals(4, singleNumber.singleNumber(except));
    }

}