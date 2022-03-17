package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Triangle;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void examples() {
        Assert.assertEquals('R', Triangle.triangle("GB"));
        Assert.assertEquals('R', Triangle.triangle("RRR"));
        Assert.assertEquals('B', Triangle.triangle("RGBG"));
        Assert.assertEquals('G', Triangle.triangle("RBRGBRB"));
        Assert.assertEquals('G', Triangle.triangle("RBRGBRBGGRRRBGBBBGG"));
        Assert.assertEquals('B', Triangle.triangle("B"));
    }

}