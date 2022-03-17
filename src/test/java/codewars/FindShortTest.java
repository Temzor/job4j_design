package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.FindShort;
import org.junit.Test;

public class FindShortTest {
    @Test
    public void findShort() {
        Assert.assertEquals(3, FindShort.findShort("bitcoin take over the world maybe who knows perhaps"));
        Assert.assertEquals(3, FindShort.findShort("turns out random test cases are easier than writing out basic ones"));
        Assert.assertEquals(2, FindShort.findShort("Let's travel abroad shall we"));
    }
}