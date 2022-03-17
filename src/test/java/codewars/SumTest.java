package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Sum;
import org.junit.Test;

public class SumTest {
    @Test
    public void sampleTests() {
        Assert.assertEquals(21, Sum.arrayPlusArray(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        Assert.assertEquals(-21, Sum.arrayPlusArray(new int[]{-1, -2, -3}, new int[]{-4, -5, -6}));
        Assert.assertEquals(15, Sum.arrayPlusArray(new int[]{0, 0, 0}, new int[]{4, 5, 6}));
        Assert.assertEquals(2100, Sum.arrayPlusArray(new int[]{100, 200, 300}, new int[]{400, 500, 600}));
    }

}