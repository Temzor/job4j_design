package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.TwoToOne;
import org.junit.Test;

public class TwoToOneTest {
    @Test
    public void test() {
        System.out.println("longest Fixed Tests");
        Assert.assertEquals("aehrsty", TwoToOne.longest("aretheyhere", "yestheyarehere"));
        Assert.assertEquals("abcdefghilnoprstu", TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        Assert.assertEquals("acefghilmnoprstuy", TwoToOne.longest("inmanylanguages", "theresapairoffunctions"));
    }

}