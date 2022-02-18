package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;
import ru.leetcode.easy.TwoSum;


public class TwoSumTest {
    
    @Test
    public void testOne() {
        int[] result = new int[] {0, 1};
        int[] expected = new TwoSum().twoSum(new int[] {2,7,11,15}, 9);
        Assert.assertArrayEquals(result, expected);
    }

    @Test
    public void testTwo() {
        int[] result = new int[] {0, 2};
        int[] expected = new TwoSum().twoSum(new int[] {3, 2, 3}, 6);
        Assert.assertArrayEquals(result, expected);
    }
}