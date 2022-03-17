package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Ascii;
import org.junit.Test;

import static org.junit.Assert.*;

public class AsciiTest {
    @Test
    public void testChar() {
        Assert.assertEquals('7', Ascii.getChar(55));
        Assert.assertEquals('8', Ascii.getChar(56));
        Assert.assertEquals('9', Ascii.getChar(57));
        Assert.assertEquals(':', Ascii.getChar(58));
        Assert.assertEquals(';', Ascii.getChar(59));
        Assert.assertEquals('<', Ascii.getChar(60));
        Assert.assertEquals('=', Ascii.getChar(61));
        Assert.assertEquals('>', Ascii.getChar(62));
        Assert.assertEquals('?', Ascii.getChar(63));
        Assert.assertEquals('@', Ascii.getChar(64));
        Assert.assertEquals('A', Ascii.getChar(65));
        Assert.assertEquals("getChar should return a `char`", 0, Character.compare('!', Ascii.getChar(33)));
    }

}