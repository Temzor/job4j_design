package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Digitize;
import org.junit.Test;

public class DigitizeTest {
    @Test
    public void tests() {
        Assert.assertArrayEquals(new int[] {1, 3, 2, 5, 3}, Digitize.digitize(35231));
    }
}