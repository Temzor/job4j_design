package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Geometry;
import org.junit.Test;

public class GeometryTest {
    private static final double DELTA = 1e-15;
    @Test
    public void basicTests() {
        Assert.assertEquals(1.62, Geometry.squareArea(2), DELTA);
        Assert.assertEquals(0, Geometry.squareArea(0), DELTA);
        Assert.assertEquals(80, Geometry.squareArea(14.05), DELTA);
    }

}