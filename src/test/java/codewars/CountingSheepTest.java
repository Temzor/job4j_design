package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.CountingSheep;
import org.junit.Test;

public class CountingSheepTest {
    @Test
    public void testSomething() {
        Assert.assertEquals("1 sheep...", CountingSheep.countingSheep(1));
        Assert.assertEquals("1 sheep...2 sheep...", CountingSheep.countingSheep(2));
        Assert.assertEquals("1 sheep...2 sheep...3 sheep...", CountingSheep.countingSheep(3));
    }

}