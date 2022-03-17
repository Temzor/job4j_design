package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Sid;
import org.junit.Test;

public class SidTest {
    @Test
    public void test1() {
        System.out.println("Checking for Odd numbers.");
        Assert.assertEquals(9, Sid.simpleMultiplication(1));
        Assert.assertEquals(27, Sid.simpleMultiplication(3));
        Assert.assertEquals(189, Sid.simpleMultiplication(21));
        Assert.assertEquals(207, Sid.simpleMultiplication(23));
    }

    @Test
    public void test2() {
        System.out.println("Checking for Even numbers.");
        Assert.assertEquals(16, Sid.simpleMultiplication(2));
        Assert.assertEquals(32, Sid.simpleMultiplication(4));
        Assert.assertEquals(176, Sid.simpleMultiplication(22));
        Assert.assertEquals(208, Sid.simpleMultiplication(26));
    }

}