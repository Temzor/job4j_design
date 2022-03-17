package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.DutyFree;
import org.junit.Test;

public class DutyFreeTest {
    @Test
    public void fixedTests() {
        Assert.assertEquals(166, DutyFree.dutyFree(12, 50, 1000));
        Assert.assertEquals(294, DutyFree.dutyFree(17, 10, 500));
        Assert.assertEquals(357, DutyFree.dutyFree(24, 35, 3000));
        Assert.assertEquals(20, DutyFree.dutyFree(1400, 35, 10000));
        Assert.assertEquals(38, DutyFree.dutyFree(700, 26, 7000));
    }
}