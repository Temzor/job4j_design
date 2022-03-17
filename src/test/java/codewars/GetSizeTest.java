package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.GetSize;
import org.junit.Test;

public class GetSizeTest {
    @Test
    public void test1() {

        Assert.assertEquals(new int[] {88, 48 }, GetSize.getSize(4, 2, 6));
        Assert.assertEquals(new int[] {6, 1 }, GetSize.getSize(1, 1, 1));
        Assert.assertEquals(new int[] {10, 2 }, GetSize.getSize(1, 2, 1));
        Assert.assertEquals(new int[] {16, 4 }, GetSize.getSize(1, 2, 2));
        Assert.assertEquals(new int[] {600, 1000 }, GetSize.getSize(10, 10, 10));
    }

}