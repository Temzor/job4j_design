package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Dubstep;
import org.junit.Test;

public class DubstepTest {
    @Test
    public void test1() {
        Assert.assertEquals("ABC", Dubstep.songDecoder("WUBWUBABCWUB"));
    }
    @Test
    public void test2() {
        Assert.assertEquals("R L", Dubstep.songDecoder("RWUBWUBWUBLWUB"));
    }

}