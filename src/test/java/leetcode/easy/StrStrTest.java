package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class StrStrTest {

    @Test
    public void testOne() {
        StrStr strStr = new StrStr();
        Assert.assertEquals(2, strStr.strStr("Hello", "ll"));
    }

}