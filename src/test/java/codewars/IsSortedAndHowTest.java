package codewars;

import codewars.IsSortedAndHow;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsSortedAndHowTest {
    @Test
    public void test1() {
        int[] array = new int[] {1, 2};
        assertEquals("yes, ascending", IsSortedAndHow.isSortedAndHow(array));
    }

    @Test
    public void test2() {
        int[] array = new int[] {15, 7, 3, -8};
        assertEquals("yes, descending", IsSortedAndHow.isSortedAndHow(array));
    }

    @Test
    public void test3() {
        int[] array = new int[] {4, 2, 30};
        assertEquals("no", IsSortedAndHow.isSortedAndHow(array));
    }


}