package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;
import ru.leetcode.easy.RemoveDuplicates;

public class RemoveDuplicatesTest {
    @Test
    public void testOne() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int result = removeDuplicates.removeDuplicates(new int[] {1, 2, 2, 3, 3, 4});
        int expected =  4;
        Assert.assertEquals(expected, result);
    }


}