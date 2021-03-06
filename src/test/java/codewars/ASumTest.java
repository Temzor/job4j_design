package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.ASum;
import org.junit.Test;

public class ASumTest {
    @Test
    public void test1() {
        Assert.assertEquals(2022, ASum.findNb(4183059834009L));
    }
    @Test
    public void test2() {
        Assert.assertEquals(-1, ASum.findNb(24723578342962L));
    }
    @Test
    public void test3() {
        Assert.assertEquals(4824, ASum.findNb(135440716410000L));
    }
    @Test
    public void test4() {
        Assert.assertEquals(3568, ASum.findNb(40539911473216L));
    }


}