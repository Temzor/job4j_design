package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.SpinWords;
import org.junit.Test;

public class SpinWordsTest {
    @Test
    public void test() {
        Assert.assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        Assert.assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }
}