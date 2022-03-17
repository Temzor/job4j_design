package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.TwiceAsOld;
import org.junit.Test;

public class TwiceAsOldTest {
    @Test
    public void testSomething() {
        Assert.assertEquals(30, TwiceAsOld.twiceAsOld(30, 0));
        Assert.assertEquals(16, TwiceAsOld.twiceAsOld(30, 7));
        Assert.assertEquals(15, TwiceAsOld.twiceAsOld(45, 30));
        Assert.assertEquals(21, TwiceAsOld.twiceAsOld(29, 25));

    }

}