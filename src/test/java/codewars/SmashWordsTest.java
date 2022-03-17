package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.SmashWords;
import org.junit.Test;

public class SmashWordsTest {
    @Test
    public void validate() {
        Assert.assertEquals("Bilal Djaghout", SmashWords.smash("Bilal", "Djaghout"));
    }

    @Test
    public void validateEmpty() {
        Assert.assertEquals("", SmashWords.smash());
    }


    @Test
    public void validateOneWord() {
        Assert.assertEquals("Bilal", SmashWords.smash("Bilal"));
    }


}