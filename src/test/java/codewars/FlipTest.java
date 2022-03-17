package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Flip;
import org.junit.Test;

public class FlipTest {
    @Test
    public void sample() {
        Assert.assertEquals(new int[]{1, 2, 2, 3 }, Flip.flip('R', new int[]{3, 2, 1, 2}));
        Assert.assertEquals(new int[]{5, 5, 4, 3, 1}, Flip.flip('L', new int[]{1, 4, 5, 3, 5}));
    }
}