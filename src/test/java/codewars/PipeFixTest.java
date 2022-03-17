package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.PipeFix;
import org.junit.Test;

public class PipeFixTest {
    @Test
    public void tests() {
        Assert.assertEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, PipeFix.pipeFix(new int[] {1, 2, 3, 5, 6, 8, 9}));
        Assert.assertEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, PipeFix.pipeFix(new int[] {1, 2, 3, 12}));
        Assert.assertEquals(new int[] {6, 7, 8, 9}, PipeFix.pipeFix(new int[] {6, 9}));
        Assert.assertEquals(new int[] {-1, 0, 1, 2, 3, 4}, PipeFix.pipeFix(new int[] {-1, 4}));
        Assert.assertEquals(new int[] {1, 2, 3}, PipeFix.pipeFix(new int[] {1, 2, 3}));
    }

}