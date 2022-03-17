package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.IsSortedAndHow;
import org.junit.Test;

public class IsSortedAndHowTest {
    @Test
    public void test1() {
        int[] array = new int[] {1, 2};
        Assert.assertEquals("yes, ascending", IsSortedAndHow.isSortedAndHow(array));
    }

    @Test
    public void test2() {
        int[] array = new int[] {15, 7, 3, -8};
        Assert.assertEquals("yes, descending", IsSortedAndHow.isSortedAndHow(array));
    }

    @Test
    public void test3() {
        int[] array = new int[] {4, 2, 30};
        Assert.assertEquals("no", IsSortedAndHow.isSortedAndHow(array));
    }


}