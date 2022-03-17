package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Repeats;
import org.junit.Test;

public class RepeatsTest {
    @Test
    public void basicTests() {
        Assert.assertEquals(15, Repeats.repeats(new int[]{4, 5, 7, 5, 4, 8}));
        Assert.assertEquals(19, Repeats.repeats(new int[]{9, 10, 19, 13, 19, 13}));
        Assert.assertEquals(12, Repeats.repeats(new int[]{16, 0, 11, 4, 8, 16, 0, 11}));
    }

}