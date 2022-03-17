package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.ZywOo;
import org.junit.Test;

public class ZywOoTest {
    @Test
    public void testSomething() {
        Assert.assertEquals("Oi! Sheep number 2! You are about to be eaten by a wolf!", ZywOo.warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
        Assert.assertEquals("Oi! Sheep number 5! You are about to be eaten by a wolf!", ZywOo.warnTheSheep(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        Assert.assertEquals("Oi! Sheep number 6! You are about to be eaten by a wolf!", ZywOo.warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        Assert.assertEquals("Oi! Sheep number 1! You are about to be eaten by a wolf!", ZywOo.warnTheSheep(new String[]{"sheep", "wolf", "sheep"}));
        Assert.assertEquals("Pls go away and stop eating my sheep", ZywOo.warnTheSheep(new String[]{"sheep", "sheep", "wolf"}));
    }

}