package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.GrassHopper4;
import org.junit.Test;

public class GrassHopper4Test {
    @Test
    public void test1() {
        Assert.assertEquals(1,
                GrassHopper4.findAverage(new int[]{1}));
    }
    @Test
    public void test2() {
        Assert.assertEquals(4,
                GrassHopper4.findAverage(new int[]{1, 3, 5, 7}));
    }

}