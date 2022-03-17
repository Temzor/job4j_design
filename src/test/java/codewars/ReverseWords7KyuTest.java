package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.ReverseWords7Kyu;
import org.junit.Test;

public class ReverseWords7KyuTest {
    @Test
    public void exampleCases() {
        Assert.assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", ReverseWords7Kyu.reverseWords("The quick brown fox jumps over the lazy dog."));
        Assert.assertEquals("elppa", ReverseWords7Kyu.reverseWords("apple"));
        Assert.assertEquals("a b c d", ReverseWords7Kyu.reverseWords("a b c d"));
        Assert.assertEquals("elbuod  decaps  sdrow", ReverseWords7Kyu.reverseWords("double  spaced  words"));
    }

}