package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Solve4;
import org.junit.Test;

public class Solve4Test {
    @Test
    public void basicTests() {
        Assert.assertEquals(3, Solve4.solve(new int[] {1, -1, 2, -2, 3}));
        Assert.assertEquals(-4, Solve4.solve(new int[] {-3, 1, 2, 3, -1, -4, -2}));
        Assert.assertEquals(3, Solve4.solve(new int[] {1, -1, 2, -2, 3, 3}));
        Assert.assertEquals(-38, Solve4.solve(new int[] {-110, 110, -38, -38, -62, 62, -38, -38, -38}));
        Assert.assertEquals(-9, Solve4.solve(new int[] {-9, -105, -9, -9, -9, -9, 105}));
    }

}