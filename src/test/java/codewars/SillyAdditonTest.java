package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.SillyAdditon;
import org.junit.Test;

public class SillyAdditonTest {
    @Test
    public void realAddition() {
        Assert.assertEquals(13, SillyAdditon.add(2, 11));
        Assert.assertEquals(1, SillyAdditon.add(0, 1));
        Assert.assertEquals(0, SillyAdditon.add(0, 0));
    }
    @Test
    public void sillyAdditon() {
        Assert.assertEquals(214, SillyAdditon.add(16, 18));
        Assert.assertEquals(515, SillyAdditon.add(26, 39));
        Assert.assertEquals(1103, SillyAdditon.add(122, 81));
    }
}