package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.AddFive;
import org.junit.Test;

public class AddFiveTest {
    @Test
    public void testAddFive() {
        Assert.assertEquals(10, AddFive.addFive(5));
    }
    @Test
    public void testAddZero() {
        Assert.assertEquals(5, AddFive.addFive(0));
    }
    @Test
    public void testAddNegativeFive() {
        Assert.assertEquals(0, AddFive.addFive(-5));
    }
    @Test
    public void testRandom() {
        for (int i = 0; i < 50; i++) {
            int rand = (int) (Math.random() * 1000) + 1;
            Assert.assertEquals(rand + 5, AddFive.addFive(rand));
        }
    }
}