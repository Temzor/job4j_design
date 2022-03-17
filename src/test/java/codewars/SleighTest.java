package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Sleigh;
import org.junit.Test;

public class SleighTest {
    @Test
    public void testAuthentication() {
        Assert.assertEquals(true, Sleigh.authenticate("Santa Claus", "Ho Ho Ho!"));
        Assert.assertEquals(false, Sleigh.authenticate("Santa", "Ho Ho Ho!"));
        Assert.assertEquals(false, Sleigh.authenticate("Santa Claus", "Ho Ho Ho"));
    }

}