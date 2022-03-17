package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.RemoveDuplicateWords;
import org.junit.Test;

public class RemoveDuplicateWordsTest {
    @Test
    public void basicTests() {
        Assert.assertEquals("alpha beta gamma delta", RemoveDuplicateWords.removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
        Assert.assertEquals("my cat is fat", RemoveDuplicateWords.removeDuplicateWords("my cat is my cat fat"));
    }

}