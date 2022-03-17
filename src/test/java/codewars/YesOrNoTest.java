package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.YesOrNo;
import org.junit.Test;

public class YesOrNoTest {
    @Test
    public void testBoolToWord() {
        Assert.assertEquals(YesOrNo.boolToWord(true), "Yes");
        Assert.assertEquals(YesOrNo.boolToWord(false), "No");
    }
}