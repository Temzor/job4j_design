package leetcode.easy;

import junit.framework.TestCase;
import ru.leetcode.easy.LongestCommonPrefix;


public class LongestCommonPrefixTest extends TestCase {

    public void testOne() {
        LongestCommonPrefix longestCommonPrefix  = new LongestCommonPrefix();
        String[] in = new String[] {"flower", "flow", "flight"};
        String result = longestCommonPrefix.longestCommonPrefix(in);
        String expected  = "fl";
        assertEquals(expected, result);
    }

    public void testTwo() {
        LongestCommonPrefix longestCommonPrefix  = new LongestCommonPrefix();
        String[] in = new String[] {"flower", "gow", "night"};
        String result = longestCommonPrefix.longestCommonPrefix(in);
        String expected  = "";
        assertEquals(expected, result);
    }
}