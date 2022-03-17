package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.School;
import org.junit.Test;

public class SchoolTest {
    @Test
    public void simpleTest() {
        Assert.assertEquals(2, School.getAverage(new int[]{2, 2, 2, 2}));
        Assert.assertEquals(3, School.getAverage(new int[]{1, 2, 3, 4, 5}));
        Assert.assertEquals(1, School.getAverage(new int[]{1, 1, 1, 1, 1, 1, 1, 2}));

    }
}