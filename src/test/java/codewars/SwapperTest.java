package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Swapper;
import org.junit.Test;

public class SwapperTest {
    @Test
    public void testSomething() {
        Integer[] args = new Integer[]{1, 2};

        Swapper r = new Swapper(args);
        r.swapValues();
        Assert.assertEquals("Failed swapping numbers", 2, r.arguments[0]);
        Assert.assertEquals("Failed swapping numbers", 1, r.arguments[1]);
    }

}