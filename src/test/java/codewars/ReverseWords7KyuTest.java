package codewars;

import codewars.ReverseWords7Kyu;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWords7KyuTest {
    @Test
    public void exampleCases() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", ReverseWords7Kyu.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", ReverseWords7Kyu.reverseWords("apple"));
        assertEquals("a b c d", ReverseWords7Kyu.reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", ReverseWords7Kyu.reverseWords("double  spaced  words"));
    }

}