package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.AddLetters;
import org.junit.Test;

public class AddLettersTest {
    @Test
    public void fixedTests() {
        Assert.assertEquals("f", AddLetters.addLetters("a", "b", "c"));
        Assert.assertEquals("z", AddLetters.addLetters("z"));
        Assert.assertEquals("c", AddLetters.addLetters("a", "b"));
        Assert.assertEquals("c", AddLetters.addLetters("c"));
        Assert.assertEquals("a", AddLetters.addLetters("z", "a"));
        Assert.assertEquals("d", AddLetters.addLetters("y", "c", "b"));
        Assert.assertEquals("z", AddLetters.addLetters());
    }

}