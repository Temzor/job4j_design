package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Century;
import org.junit.Test;

public class CenturyTest {

    @Test
    public void fixedTests() {
        Assert.assertEquals(18, Century.century(1705));
        Assert.assertEquals(19, Century.century(1900));
        Assert.assertEquals(17, Century.century(1601));
        Assert.assertEquals(20, Century.century(2000));
        Assert.assertEquals(1,  Century.century(89));
    }
}
