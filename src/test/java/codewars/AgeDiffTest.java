package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.AgeDiff;
import org.junit.Test;

public class AgeDiffTest {
    @Test
    public void testAge() {

        Assert.assertEquals("You are 4 years old.", AgeDiff.calculateAge(2012, 2016));
        Assert.assertEquals("You are 27 years old.", AgeDiff.calculateAge(1989, 2016));
        Assert.assertEquals("You are 90 years old.", AgeDiff.calculateAge(2000, 2090));
        Assert.assertEquals("You will be born in 10 years.", AgeDiff.calculateAge(2000, 1990));
        Assert.assertEquals("You were born this very year!", AgeDiff.calculateAge(3400, 3400));
        Assert.assertEquals("You are 2000 years old.", AgeDiff.calculateAge(900, 2900));
        Assert.assertEquals("You will be born in 110 years.", AgeDiff.calculateAge(2010, 1900));
        Assert.assertEquals("You will be born in 510 years.", AgeDiff.calculateAge(2010, 1500));
        Assert.assertEquals("You are 1 year old.", AgeDiff.calculateAge(2011, 2012));
        Assert.assertEquals("You will be born in 1 year.", AgeDiff.calculateAge(2000, 1999));

    }

}