package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.OddCount;
import org.junit.Test;

public class OddCountTest {
    @Test
    public void fixedTests() {
        Assert.assertEquals(7, OddCount.oddCount(15));
        Assert.assertEquals(7511, OddCount.oddCount(15023));
    }

}