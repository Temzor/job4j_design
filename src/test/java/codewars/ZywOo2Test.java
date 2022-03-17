package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.ZywOo2;
import org.junit.Test;

public class ZywOo2Test {
    @Test
    public void basicTests() {
        Assert.assertEquals("More than a handful!", ZywOo2.howManyDalmations(26));
        Assert.assertEquals("Hardly any", ZywOo2.howManyDalmations(8));
        Assert.assertEquals("More than a handful!", ZywOo2.howManyDalmations(14));
        Assert.assertEquals("Woah that's a lot of dogs!", ZywOo2.howManyDalmations(80));
        Assert.assertEquals("Woah that's a lot of dogs!", ZywOo2.howManyDalmations(100));
        Assert.assertEquals("101 DALMATIANS!!!", ZywOo2.howManyDalmations(101));
    }

}