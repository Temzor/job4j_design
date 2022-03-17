package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.GetVolumeOfCuboid;
import org.junit.Test;

public class GetVolumeOfCuboidTest {
    @Test
    public void examples() {
        Assert.assertEquals(4, GetVolumeOfCuboid.getVolumeOfCuboid(1, 2, 2), 0.0001);
        Assert.assertEquals(63, GetVolumeOfCuboid.getVolumeOfCuboid(6.3, 2, 5), 0.0001);
    }

}