package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Dinglemouse;
import org.junit.Test;

public class DinglemouseTest {
    @Test
    public void one() {
        Assert.assertArrayEquals(new int[]{1, 15, 15}, Dinglemouse.humanYearsCatYearsDogYears(1));
    }

    @Test
    public void two() {
        Assert.assertArrayEquals(new int[]{2, 24, 24}, Dinglemouse.humanYearsCatYearsDogYears(2));
    }

    @Test
    public void ten() {
        Assert.assertArrayEquals(new int[]{10, 56, 64}, Dinglemouse.humanYearsCatYearsDogYears(10));
    }

    @Test
    public void three() {
        Assert.assertArrayEquals(new int[]{3, 28, 29}, Dinglemouse.humanYearsCatYearsDogYears(3));
    }


}