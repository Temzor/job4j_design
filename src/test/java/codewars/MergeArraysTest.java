package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.MergeArrays;
import org.junit.Test;

public class MergeArraysTest {
    @Test
    public void basicTest() {
        Assert.assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6 }, MergeArrays.mergeArrays(new int[] {1, 3, 5 }, new int[] {2, 4, 6 }));
        Assert.assertArrayEquals(new int[] {2, 4, 6, 8 }, MergeArrays.mergeArrays(new int[] {2, 4, 8 }, new int[] {2, 4, 6 }));
    }

}