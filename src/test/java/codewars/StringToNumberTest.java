package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.StringToNumber;
import org.junit.Test;

public class StringToNumberTest {
    @Test
    public void test1() {
        Assert.assertEquals("stringToNumber(1234)", 1234, StringToNumber.stringToNumber("1234"));
    }
    @Test
    public void test2() {
        Assert.assertEquals("stringToNumber(605)", 605, StringToNumber.stringToNumber("605"));
    }
    @Test
    public void test3() {
        Assert.assertEquals("stringToNumber(1405)", 1405, StringToNumber.stringToNumber("1405"));
    }
    @Test
    public void test4() {
        Assert.assertEquals("stringToNumber(-7)", -7, StringToNumber.stringToNumber("-7"));
    }

}