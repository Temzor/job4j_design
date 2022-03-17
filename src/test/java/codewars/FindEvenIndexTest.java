package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.FindEvenIndex;
import org.junit.Test;

public class FindEvenIndexTest {
    @Test
    public void test() {
        Assert.assertEquals(3, FindEvenIndex.findEvenIndex(new int[] {1, 2, 3, 4, 3, 2, 1}));
        Assert.assertEquals(1, FindEvenIndex.findEvenIndex(new int[] {1, 100, 50, -51, 1, 1}));
        Assert.assertEquals(-1, FindEvenIndex.findEvenIndex(new int[] {1, 2, 3, 4, 5, 6}));
        Assert.assertEquals(3, FindEvenIndex.findEvenIndex(new int[] {20, 10, 30, 10, 10, 15, 35}));
        Assert.assertEquals(-1, FindEvenIndex.findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
        Assert.assertEquals(1, FindEvenIndex.findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
        Assert.assertEquals(6, FindEvenIndex.findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
    }

}