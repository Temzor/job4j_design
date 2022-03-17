package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Position;
import org.junit.Test;

public class PositionTest {
    @Test
    public void basicTests() {
        Assert.assertEquals("Position of alphabet: 1", Position.position('a'));
        Assert.assertEquals("Position of alphabet: 26", Position.position('z'));
        Assert.assertEquals("Position of alphabet: 5", Position.position('e'));
    }
}