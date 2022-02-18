package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.leetcode.easy.IsPalindromeString;

class IsPalindromeStringTest {
    @Test
    public void testOne() {
        IsPalindromeString isPalindromeString = new IsPalindromeString();
        String input = "A man, a plan, a canal: Panama";
        Assertions.assertTrue(isPalindromeString.isPalindromeString(input));
    }
}