package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class RemoveElementTest {
    @Test
    public void testOne() {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = new int[] {3, 2, 2, 3};
        Assert.assertEquals(2, removeElement.removeElement(nums, 3));

    }

}