package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.HowMuchILoveYou;
import org.junit.Test;

public class HowMuchILoveYouTest {
    @Test
    public void test1() {
        Assert.assertEquals("I love you", HowMuchILoveYou.howMuchILoveYou(1));
        Assert.assertEquals("a little", HowMuchILoveYou.howMuchILoveYou(2));
        Assert.assertEquals("not at all", HowMuchILoveYou.howMuchILoveYou(6));
    }

}