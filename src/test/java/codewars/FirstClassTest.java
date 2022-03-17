package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.FirstClass;
import org.junit.Test;

public class FirstClassTest {
    @Test
    public void testSum() {
        byte a = 1;
        byte b = 2;
        Assert.assertEquals(3, FirstClass.sum(a, b));
    }

}