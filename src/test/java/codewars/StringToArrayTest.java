package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.StringToArray;
import org.junit.Test;

public class StringToArrayTest {
    @Test
    public void basicTests() {
        Assert.assertArrayEquals(new String[]{"Robin", "Singh"}, StringToArray.stringToArray("Robin Singh"));
        Assert.assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"},
                StringToArray.stringToArray("I love arrays they are my favorite"));
    }

}