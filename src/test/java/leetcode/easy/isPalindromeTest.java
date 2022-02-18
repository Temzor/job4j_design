package leetcode.easy;

import org.junit.Test;
import ru.leetcode.easy.IsPalindrome;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class isPalindromeTest {
    @Test
    public void testOne() {
        IsPalindrome isPalindrome = new IsPalindrome();
        int num = 10;
        boolean result = isPalindrome.isPalindrome(num);
        assertThat(false, is(result));
    }

    @Test
    public void testTwo() {
        IsPalindrome isPalindrome = new IsPalindrome();
        int num = 121;
        boolean result = isPalindrome.isPalindrome(num);
        assertThat(true, is(result));
    }

}