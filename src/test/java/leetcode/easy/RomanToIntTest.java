package leetcode.easy;

import org.junit.Test;
import ru.leetcode.easy.RomanToInt;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;



public class RomanToIntTest {
    @Test
    public void testFiveV() {
        RomanToInt romanToInt = new RomanToInt();
        assertThat(5, is(romanToInt.romanToInt("V")));
    }

    @Test
    public void testTenX() {
        RomanToInt romanToInt = new RomanToInt();
        assertThat(10, is(romanToInt.romanToInt("X")));
    }

    @Test
    public void testEighteenXVIII() {
        RomanToInt romanToInt = new RomanToInt();
        assertThat(18, is(romanToInt.romanToInt("XVIII")));
    }

}