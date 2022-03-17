package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.MixedSum;
import org.junit.Test;

import java.util.Arrays;

public class MixedSumTest {
    MixedSum mixedSum = new MixedSum();

    @Test
    public void test1() {
        Assert.assertEquals(10, mixedSum.sum(Arrays.asList(5, "5")));
    }

    @Test
    public void test2() {
        Assert.assertEquals(22, mixedSum.sum(Arrays.asList(9, 3, "7", "3")));
    }

    @Test
    public void test3() {
        Assert.assertEquals(42, mixedSum.sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
    }

    @Test
    public void test4() {
        Assert.assertEquals(41, mixedSum.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
    }

    @Test
    public void test5() {
        Assert.assertEquals(45, mixedSum.sum(Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3")));
    }

    @Test
    public void test6() {
        Assert.assertEquals(41, mixedSum.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
    }

    @Test
    public void test7() {
        Assert.assertEquals(61, mixedSum.sum(Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)));
    }

}