package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Line;
import org.junit.Test;

public class LineTest {
    @Test
    public void test1() {
        Assert.assertEquals("YES", Line.tickets(new int[] {25, 25, 50}));
    }
    @Test
    public void test2() {
        Assert.assertEquals("NO", Line.tickets(new int[] {25, 100}));
    }

}