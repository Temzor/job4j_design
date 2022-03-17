package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.TrafficLights;
import org.junit.Test;

public class TrafficLightsTest {
    @Test
    public void updatelight() {
        Assert.assertEquals("green", TrafficLights.updateLight("red"));
        Assert.assertEquals("yellow", TrafficLights.updateLight("green"));
        Assert.assertEquals("red", TrafficLights.updateLight("yellow"));
    }

}