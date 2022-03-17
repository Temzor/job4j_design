package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Solve3;
import org.junit.Test;

public class Solve3Test {
    @Test
    public void basicTests() {
        Assert.assertArrayEquals(new int[]{4, 6, 3}, Solve3.solve(new int[]{3, 4, 4, 3, 6, 3}));
        Assert.assertArrayEquals(new int[]{1, 2, 3}, Solve3.solve(new int[]{1, 2, 1, 2, 1, 2, 3}));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4}, Solve3.solve(new int[]{1, 2, 3, 4}));
        Assert.assertArrayEquals(new int[]{4, 5, 2, 1}, Solve3.solve(new int[]{1, 1, 4, 5, 1, 2, 1}));
    }
}