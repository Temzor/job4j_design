package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.SimpleFun;
import org.junit.Test;

public class SimpleFunTest {
    @Test
    public void basicTests() {
        doTest(100, 10, 910, 10);
        doTest(10,  9,   4,  1);
    }
    private void doTest(int upSpeed, int downSpeed, int desiredHeight, int expected) {
        Assert.assertEquals(expected, SimpleFun.growingPlant(upSpeed, downSpeed, desiredHeight));
    }

}