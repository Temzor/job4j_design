package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.BuildString;
import org.junit.Test;

public class BuildStringTest {
    @Test
    public void fixedTests() {
        Assert.assertEquals(BuildString.buildString("Cheese", "Milk", "Chocolate"), "I like Cheese, Milk, Chocolate!");
        Assert.assertEquals(BuildString.buildString("Cheese", "Milk"), "I like Cheese, Milk!");
        Assert.assertEquals(BuildString.buildString("Chocolate"), "I like Chocolate!");
    }

}