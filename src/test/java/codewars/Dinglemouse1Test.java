package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Dinglemouse1;
import org.junit.Test;

public class Dinglemouse1Test {
    @Test
    public void test() {
        Assert.assertEquals(123, Dinglemouse1.INST.plus100(23));
        Assert.assertEquals(134, Dinglemouse1.INST.plus100(34));
        Assert.assertEquals(64, Dinglemouse1.INST.plus100(-36));
    }
}