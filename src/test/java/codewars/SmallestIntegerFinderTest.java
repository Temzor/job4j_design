package codewars;

import org.testng.Assert;
import ru.codewars.eightkyu.SmallestIntegerFinder;
import org.junit.Test;

public class SmallestIntegerFinderTest {

    @Test
    public void example1() {
        int expected = 11;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78, 56, 232, 12, 11, 43});
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void example2() {
        int expected = -33;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78, 56, -2, 12, 8, -33});
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        int expected = Integer.MIN_VALUE;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{0,
                Integer.MIN_VALUE,
                Integer.MAX_VALUE});
        Assert.assertEquals(expected, actual);
    }
}