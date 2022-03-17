package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.GrassHopper3;
import org.junit.Test;

public class GrassHopper3Test {
    @Test
    public void testA() {
        Assert.assertEquals("10.0 is above freezing temperature", GrassHopper3.weatherInfo(50));
    }
    @Test
    public void testB() {
        Assert.assertEquals("-5.0 is freezing temperature", GrassHopper3.weatherInfo(23));
    }

}