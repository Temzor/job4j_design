package codewars;

import codewars.ThirdAngle;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThirdAngleTest {
    @Test
    public void testOtherAngle() {
        assertEquals(123, ThirdAngle.otherAngle(45, 12));
        assertEquals(70, ThirdAngle.otherAngle(50, 60));
    }

}