package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.AutoMorphic;
import org.junit.Test;

public class AutoMorphicTest {
    @Test
    public void oneDigitNumber() {
        Assert.assertEquals("Automorphic", AutoMorphic.autoMorphic(1));
        Assert.assertEquals("Not!!",       AutoMorphic.autoMorphic(3));
        Assert.assertEquals("Automorphic", AutoMorphic.autoMorphic(6));
        Assert.assertEquals("Not!!",       AutoMorphic.autoMorphic(9));
    }
    @Test
    public void twoDigitNumber() {
        Assert.assertEquals("Automorphic", AutoMorphic.autoMorphic(25));
        Assert.assertEquals("Not!!",       AutoMorphic.autoMorphic(13));
        Assert.assertEquals("Automorphic", AutoMorphic.autoMorphic(76));
        Assert.assertEquals("Not!!",       AutoMorphic.autoMorphic(95));
    }
    @Test
    public void largerNumber() {
        Assert.assertEquals("Automorphic", AutoMorphic.autoMorphic(625));
        Assert.assertEquals("Not!!",       AutoMorphic.autoMorphic(225));
        Assert.assertEquals("Not!!",       AutoMorphic.autoMorphic(425));
        Assert.assertEquals("Not!!",       AutoMorphic.autoMorphic(399));
    }

}