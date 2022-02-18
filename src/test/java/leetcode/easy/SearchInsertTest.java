package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;
import ru.leetcode.easy.SearchInsert;

public class SearchInsertTest {
    @Test
    public void testOne() {
        SearchInsert searchInsert = new SearchInsert();
        int[] nums = new int[] {1, 8, 9, 11};
        int target = 4;
        Assert.assertEquals(1, searchInsert.searchInsert(nums, target));
    }

    @Test
    public void testTwo() {
        SearchInsert searchInsert = new SearchInsert();
        int[] nums = new int[] {1, 8, 9, 11};
        int target = 16;
        Assert.assertEquals(4, searchInsert.searchInsert(nums, target));
    }

}