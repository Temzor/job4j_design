package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Maps;
import org.junit.Test;

public class MapsTest {
    @Test
    public void sampleTests() {
        Assert.assertEquals(new int[] {2, 4, 6}, Maps.map(new int[] {1, 2, 3}));
        Assert.assertEquals(new int[] {8, 2, 2, 2, 8}, Maps.map(new int[] {4, 1, 1, 1, 4}));
        Assert.assertEquals(new int[] {2, 2, 2, 2, 2, 2}, Maps.map(new int[] {1, 1, 1, 1, 1, 1}));
    }

}