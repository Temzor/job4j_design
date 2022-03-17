package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.MinMax;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class MinMaxTest {
    Random rand;

    @Before
    public void initTest() {
        rand = new Random();
    }

    @Test
    public void testExampleCases() {
        Assert.assertArrayEquals(new int[]{1, 5}, MinMax.minMax(new int[]{1, 2, 3, 4, 5}));
        Assert.assertArrayEquals(new int[]{5, 2334454}, MinMax.minMax(new int[]{2334454, 5}));
        Assert.assertArrayEquals(new int[]{1, 1}, MinMax.minMax(new int[]{1}));
    }

    @Test
    public void minMaxRandomTest() {
        for (int i = 0; i < 20; i++) {
            int r = rand.nextInt();
            Assert.assertArrayEquals(new int[]{r, r}, MinMax.minMax(new int[]{r}));
        }
    }

}