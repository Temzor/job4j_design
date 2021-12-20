package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class LengthOfLastWordTest {
    @Test
    public void testOne() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        String result = "Hello World";
        Assert.assertEquals(5, lengthOfLastWord.lengthOfLastWord(result));
    }

    @Test
    public void testTwo() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        String result = "   fly me   to   the moon  ";
        Assert.assertEquals(4, lengthOfLastWord.lengthOfLastWord(result));
    }


}