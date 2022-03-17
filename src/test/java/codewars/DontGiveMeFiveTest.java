package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.DontGiveMeFive;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DontGiveMeFiveTest {
    @Test
    public void exampleTests() {
        Assert.assertEquals(8, DontGiveMeFive.dontGiveMeFive(1, 9));
        Assert.assertEquals(12, DontGiveMeFive.dontGiveMeFive(4, 17));
    }
}