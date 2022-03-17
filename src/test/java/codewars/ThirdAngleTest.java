package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.ThirdAngle;
import org.junit.Test;

public class ThirdAngleTest {
    @Test
    public void testOtherAngle() {
        Assert.assertEquals(123, ThirdAngle.otherAngle(45, 12));
        Assert.assertEquals(70, ThirdAngle.otherAngle(50, 60));
    }

}