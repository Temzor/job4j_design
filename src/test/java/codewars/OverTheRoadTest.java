package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.OverTheRoad;
import org.junit.Test;

public class OverTheRoadTest {
    @Test
    public void basicTestCases() {
        Assert.assertEquals(6, OverTheRoad.overTheRoad(1, 3));
        Assert.assertEquals(4, OverTheRoad.overTheRoad(3, 3));
        Assert.assertEquals(5, OverTheRoad.overTheRoad(2, 3));
        Assert.assertEquals(8, OverTheRoad.overTheRoad(3, 5));
        Assert.assertEquals(16, OverTheRoad.overTheRoad(7, 11));
        Assert.assertEquals(1999981L, OverTheRoad.overTheRoad(20, 1000000));
        Assert.assertEquals(596421736780L, OverTheRoad.overTheRoad(23633656673L, 310027696726L));
    }

}