package codewars;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MultiplyAllTest {
    @Test
    public void isArray() {
        assertEquals(int[].class, MultiplyAll.multiplyAll(new int[]{1}).apply(1).getClass());
    }

    @Test
    public void hasCorrectLength() {
        assertEquals(2, MultiplyAll.multiplyAll(new int[]{1, 2}).apply(1).length);
    }

    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{1, 2, 3}, MultiplyAll.multiplyAll(new int[]{1, 2, 3}).apply(1));
        assertArrayEquals(new int[]{2, 4, 6}, MultiplyAll.multiplyAll(new int[]{1, 2, 3}).apply(2));
        assertArrayEquals(new int[]{0, 0, 0}, MultiplyAll.multiplyAll(new int[]{1, 2, 3}).apply(0));
//        assertArrayEquals(new int[0], MultiplyAll.multiplyAll(new int[0]).apply(10), "should return an empty array");
    }

}