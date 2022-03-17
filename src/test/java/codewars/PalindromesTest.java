package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Palindromes;
import org.junit.Test;

public class PalindromesTest {
    @Test
    public void testPalindrome() {
        Assert.assertEquals(0, Palindromes.palindromeChainLength(1));
        Assert.assertEquals(0, Palindromes.palindromeChainLength(88));
        Assert.assertEquals(0, Palindromes.palindromeChainLength(393));
    }

    @Test
    public void testNonPalindrome() {
        Assert.assertEquals(1, Palindromes.palindromeChainLength(10));
        Assert.assertEquals(1, Palindromes.palindromeChainLength(134));
        Assert.assertEquals(4, Palindromes.palindromeChainLength(87));
        Assert.assertEquals(7, Palindromes.palindromeChainLength(2897));
        Assert.assertEquals(24, Palindromes.palindromeChainLength(89));
    }

}