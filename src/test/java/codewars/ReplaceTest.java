package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Replace;
import org.junit.Test;

public class ReplaceTest {
    @Test
    public void basicTests() {
        Assert.assertEquals("H!!",      Replace.replace("Hi!"));
        Assert.assertEquals("!H!! H!!", Replace.replace("!Hi! Hi!"));
        Assert.assertEquals("!!!!!",    Replace.replace("aeiou"));
        Assert.assertEquals("!BCD!",    Replace.replace("ABCDE"));
    }

}