package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.NumberFun;
import org.junit.Test;

public class NumberFunTest {
    @Test
    public void test1() {
        Assert.assertEquals(144, NumberFun.findNextSquare(121));
    }

    @Test
    public void test2() {
        Assert.assertEquals(676, NumberFun.findNextSquare(625));
    }

    @Test
    public void test3() {
        Assert.assertEquals(-1, NumberFun.findNextSquare(114));
    }
}