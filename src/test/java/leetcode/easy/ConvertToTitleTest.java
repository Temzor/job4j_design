package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.leetcode.easy.ConvertToTitle;

class ConvertToTitleTest {
    @Test
    public void testOne() {
        int column = 1;
        String expect = "A";
        String convertToTitle = new ConvertToTitle().convertToTitle(column);
        Assertions.assertEquals(expect, convertToTitle);
    }

    @Test
    public void testTwo() {
        int column = 28;
        String expect = "AB";
        String convertToTitle = new ConvertToTitle().convertToTitle(column);
        Assertions.assertEquals(expect, convertToTitle);
    }

    @Test
    public void tesThree() {
        int column = 701;
        String expect = "ZY";
        String convertToTitle = new ConvertToTitle().convertToTitle(column);
        Assertions.assertEquals(expect, convertToTitle);
    }


}