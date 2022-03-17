package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Evaporator;
import org.junit.Test;

public class EvaporatorTest {
    @Test
    public void testEvaporatorOne() {
        Assert.assertEquals(22, Evaporator.evaporator(10, 10, 10));
    }

}