package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Leo;
import org.junit.Test;

public class LeoTest {
    @Test
    public void oscar88() {
        Assert.assertEquals("Leo finally won the oscar! Leo is happy", Leo.leo(88));
    }

    @Test
    public void oscar86() {
        Assert.assertEquals("Not even for Wolf of wallstreet?!", Leo.leo(86));
    }

    @Test
    public void below88() {
        Assert.assertEquals("When will you give Leo an Oscar?", Leo.leo(87));
        Assert.assertEquals("When will you give Leo an Oscar?", Leo.leo(83));
        Assert.assertEquals("When will you give Leo an Oscar?", Leo.leo(85));
    }

    @Test
    public void over88() {
        Assert.assertEquals("Leo got one already!", Leo.leo(89));
        Assert.assertEquals("Leo got one already!", Leo.leo(90));
        Assert.assertEquals("Leo got one already!", Leo.leo(95));
    }

}