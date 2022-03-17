package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Cube;
import org.junit.Test;

public class CubeTest {
    @Test
    public void testSetToThree() {
        Cube c = new Cube();
        c.setSide(3);
        Assert.assertEquals(3, c.getSide());
    }

}