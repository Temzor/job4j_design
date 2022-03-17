package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.FindDeletedNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindDeletedNumberTest {
    @Test
    public void basicTests() {
        Assert.assertEquals(2, FindDeletedNumber.findDeletedNumber(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 1, 5}));
        Assert.assertEquals(5, FindDeletedNumber.findDeletedNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{1, 9, 7, 4, 6, 2, 3, 8}));
        Assert.assertEquals(0, FindDeletedNumber.findDeletedNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{5, 7, 6, 9, 4, 8, 1, 2, 3}));
        Assert.assertEquals(6, FindDeletedNumber.findDeletedNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{1, 2, 3, 4, 5, 7, 8, 9}));
        Assert.assertEquals(1, FindDeletedNumber.findDeletedNumber(new int[]{1}, new int[]{}));
    }

}