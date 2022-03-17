package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.BeadsCounter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeadsCounterTest {
    @Test
    public void test0() {
        Assert.assertEquals(0, BeadsCounter.countRedBeads(0));
    }
    @Test
    public void test1() {
        Assert.assertEquals(0, BeadsCounter.countRedBeads(1));
    }
    @Test
    public void test3() {
        Assert.assertEquals(4, BeadsCounter.countRedBeads(3));
    }
    @Test
    public void test5() {
        Assert.assertEquals(8, BeadsCounter.countRedBeads(5));
    }

}