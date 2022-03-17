package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Take;
import org.junit.Test;

public class TakeTest {
    @Test
    public void basicTests() {
        Assert.assertEquals("should return the first 3 items", new int[]{0, 1, 2}, Take.take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3));
    }

}