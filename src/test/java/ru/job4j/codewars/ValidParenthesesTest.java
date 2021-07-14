package ru.job4j.codewars;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ValidParenthesesTest {
    @Test
    public void sampleTest() {
        Assert.assertTrue(ValidParentheses.validParentheses("()"));
        Assert.assertFalse(ValidParentheses.validParentheses("())"));
        Assert.assertTrue(ValidParentheses.validParentheses("32423(sgsdg)"));
        Assert.assertFalse(ValidParentheses.validParentheses("(dsgdsg))2432"));
        Assert.assertTrue(ValidParentheses.validParentheses("adasdasfa"));
        Assert.assertFalse(ValidParentheses.validParentheses("[)(())-)))(\\((vTlJ(KMhKv8P"));
    }
}
