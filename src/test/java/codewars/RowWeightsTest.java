package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.RowWeights;
import org.junit.Test;

public class RowWeightsTest {
    @Test
    public void basicTests() {
        Assert.assertArrayEquals(new int[]{80, 0}, RowWeights.rowWeights(new int[]{80}));
        Assert.assertArrayEquals(new int[]{100, 50}, RowWeights.rowWeights(new int[]{100, 50}));
        Assert.assertArrayEquals(new int[]{120, 140}, RowWeights.rowWeights(new int[]{50, 60, 70, 80}));
    }
    @Test
    public void oddVectorLength() {
        Assert.assertArrayEquals(new int[]{62, 27}, RowWeights.rowWeights(new int[]{13, 27, 49}));
        Assert.assertArrayEquals(new int[]{236, 92}, RowWeights.rowWeights(new int[]{70, 58, 75, 34, 91}));
        Assert.assertArrayEquals(new int[]{211, 164}, RowWeights.rowWeights(new int[]{29, 83, 67, 53, 19, 28, 96}));
    }
    @Test
    public void evenVectorLength() {
        Assert.assertArrayEquals(new int[]{100, 50}, RowWeights.rowWeights(new int[]{100, 50}));
        Assert.assertArrayEquals(new int[]{150, 151}, RowWeights.rowWeights(new int[]{100, 51, 50, 100}));
        Assert.assertArrayEquals(new int[]{207, 235}, RowWeights.rowWeights(new int[]{39, 84, 74, 18, 59, 72, 35, 61}));
    }

}