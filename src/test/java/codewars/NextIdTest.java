package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.NextId;
import org.junit.Test;

public class NextIdTest {
    @Test
    public void fixedTests() {
        Assert.assertEquals(4, NextId.nextId(new int[] {0, 1, 2, 3, 5 }));
        Assert.assertEquals(4, NextId.nextId(new int[] {1, 2, 0, 2, 3 }));
        Assert.assertEquals(4, NextId.nextId(new int[] {1, 2, 0, 2, 3, 5 }));
        Assert.assertEquals(11, NextId.nextId(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
        Assert.assertEquals(0, NextId.nextId(new int[] {}));
    }

}