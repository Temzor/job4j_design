package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Solve2;
import org.junit.Test;

public class Solve2Test {
    @Test
    public void sampleTest() {
        Assert.assertEquals(new int[]{4, 3, 1}, Solve2.solve(new String[]{"abode", "ABc", "xyzD"}));
        Assert.assertEquals(new int[]{4, 3, 0}, Solve2.solve(new String[]{"abide", "ABc", "xyz"}));
        Assert.assertEquals(new int[]{6, 5, 7}, Solve2.solve(new String[]{"IAMDEFANDJKL", "thedefgh", "xyzDEFghijabc"}));
        Assert.assertEquals(new int[]{1, 3, 1, 3}, Solve2.solve(new String[]{"encode", "abc", "xyzD", "ABmD"}));
    }

}