package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.ReverseWords;
import org.junit.Test;

public class ReverseWordsTest {
    @Test
    public void testSomething() {
        Assert.assertEquals("eating like I", ReverseWords.reverseWords("I like eating"));
        Assert.assertEquals("flying like I", ReverseWords.reverseWords("I like flying"));
        Assert.assertEquals("nice is world The", ReverseWords.reverseWords("The world is nice"));
    }

}