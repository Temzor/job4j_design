package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;
import ru.leetcode.easy.TitleToNumber;

public class TitleToNumberTest {
    @Test
    public void testOne() {
        TitleToNumber titleToNumber = new TitleToNumber();
        String input = "A";
        int output = 1;
        Assert.assertEquals(output, titleToNumber.titleToNumber(input));
    }

    @Test
    public void testTwo() {
        TitleToNumber titleToNumber = new TitleToNumber();
        String input = "AB";
        int output = 28;
        Assert.assertEquals(output, titleToNumber.titleToNumber(input));
    }

    @Test
    public void testThree() {
        TitleToNumber titleToNumber = new TitleToNumber();
        String input = "ZY";
        int output = 701;
        Assert.assertEquals(output, titleToNumber.titleToNumber(input));
    }


}