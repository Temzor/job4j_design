package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.MultiplyAll;
import org.junit.Test;

public class MultiplyAllTest {
    @Test
    public void isArray() {
        Assert.assertEquals(int[].class, MultiplyAll.multiplyAll(new int[]{1}).apply(1).getClass());
    }

    @Test
    public void hasCorrectLength() {
        Assert.assertEquals(2, MultiplyAll.multiplyAll(new int[]{1, 2}).apply(1).length);
    }

    @Test
    public void basicTests() {
        Assert.assertArrayEquals(new int[]{1, 2, 3}, MultiplyAll.multiplyAll(new int[]{1, 2, 3}).apply(1));
        Assert.assertArrayEquals(new int[]{2, 4, 6}, MultiplyAll.multiplyAll(new int[]{1, 2, 3}).apply(2));
        Assert.assertArrayEquals(new int[]{0, 0, 0}, MultiplyAll.multiplyAll(new int[]{1, 2, 3}).apply(0));
    }
}