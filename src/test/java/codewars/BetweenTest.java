package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Between;
import org.junit.Test;

public class BetweenTest {
    @Test
    public void basicTests() {
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4}, Between.between(1, 4));
        Assert.assertArrayEquals(new int[]{-2, -1, 0, 1, 2}, Between.between(-2, 2));
    }

}