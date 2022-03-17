package codewars;

import org.testng.Assert;
import ru.codewars.eightkyu.Counter;
import org.junit.Test;

public class CounterTest {
    Boolean[] array1 = {true,  true,  true,  false,
            true,  true,  true,  true,
            true,  false, true,  false,
            true,  false, false, true,
            true,  true,  true,  true,
            false, false, true,  true };

    @Test
    public void test() {
        Assert.assertEquals("There are 17 sheeps in total", 17, String.valueOf(new Counter().countSheeps(array1)));
    }
}