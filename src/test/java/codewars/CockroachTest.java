package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Cockroach;
import org.junit.Test;

public class CockroachTest {
    @Test
    public void basicTests() {
        Cockroach cockroach = new Cockroach();
        Assert.assertEquals(30, cockroach.cockroachSpeed(1.08));
        Assert.assertEquals(30, cockroach.cockroachSpeed(1.09));
        Assert.assertEquals(0, cockroach.cockroachSpeed(0));
    }

}