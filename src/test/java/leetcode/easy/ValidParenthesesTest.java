package leetcode.easy;

import org.junit.Test;
import ru.leetcode.easy.ValidParentheses;

import static org.junit.Assert.*;

public class ValidParenthesesTest {
    @Test
    public void testOne() {
        ValidParentheses validParentheses = new ValidParentheses();
        String result = "()";
        assertTrue(validParentheses.isValid(result));
    }

    @Test
    public void testTwo() {
        ValidParentheses validParentheses = new ValidParentheses();
        String result = "[({})]";
        assertTrue(validParentheses.isValid(result));
    }

    @Test
    public void testThree() {
        ValidParentheses validParentheses = new ValidParentheses();
        String result = "(}}";
        assertFalse(validParentheses.isValid(result));
    }

}