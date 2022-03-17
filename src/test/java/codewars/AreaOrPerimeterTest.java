package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.AreaOrPerimeter;
import org.junit.Test;

public class AreaOrPerimeterTest {
    @Test
    public void testSomething() {
        Assert.assertEquals(16, AreaOrPerimeter.areaOrPerimeter(4, 4));
        Assert.assertEquals(32, AreaOrPerimeter.areaOrPerimeter(6, 10));
    }

}