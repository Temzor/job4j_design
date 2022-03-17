package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.CuboidVolumes;
import org.junit.Test;

public class CuboidVolumesTest {
    @Test
    public void sampleTestCases() {
        Assert.assertEquals(14, CuboidVolumes.findDifference(new int[]{3, 2, 5}, new int[]{1, 4, 4}));
        Assert.assertEquals(106, CuboidVolumes.findDifference(new int[]{9, 7, 2}, new int[]{5, 2, 2}));
        Assert.assertEquals(30, CuboidVolumes.findDifference(new int[]{11, 2, 5}, new int[]{1, 10, 8}));
        Assert.assertEquals(31, CuboidVolumes.findDifference(new int[]{4, 4, 7}, new int[]{3, 9, 3}));
        Assert.assertEquals(0, CuboidVolumes.findDifference(new int[]{15, 20, 25}, new int[]{10, 30, 25}));
    }

}