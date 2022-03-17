package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.NoSpace;
import org.junit.Test;

public class NoSpaceTest {
    @Test
    public void testSomething() {
        Assert.assertEquals("8j8mBliB8gimjB8B8jlB", NoSpace.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        Assert.assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", NoSpace.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        Assert.assertEquals("8aaaaaddddr", NoSpace.noSpace("8aaaaa dddd r     "));
        Assert.assertEquals("jfBmgklf8hg88lbe8", NoSpace.noSpace("jfBm  gk lf8hg  88lbe8 "));
        Assert.assertEquals("8jaam", NoSpace.noSpace("8j aam"));
    }

}