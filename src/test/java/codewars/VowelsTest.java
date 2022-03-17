package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Vowels;
import org.junit.Test;

public class VowelsTest {
    @Test
    public void testCase1() {
        Assert.assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }

}