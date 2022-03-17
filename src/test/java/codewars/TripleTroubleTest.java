package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.TripleTrouble;
import org.junit.Test;

public class TripleTroubleTest {
    @Test
    public void tests() {
        Assert.assertEquals("ttlheoiscstk", TripleTrouble.tripleTrouble("this", "test", "lock"));
        Assert.assertEquals("abcabc", TripleTrouble.tripleTrouble("aa", "bb", "cc"));
        Assert.assertEquals("Batman", TripleTrouble.tripleTrouble("Bm", "aa", "tn"));
        Assert.assertEquals("LexLuthor", TripleTrouble.tripleTrouble("LLh", "euo", "xtr"));
    }

}