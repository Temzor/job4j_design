package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.ReversedSequence;
import org.junit.Test;

public class ReversedSequenceTest {
    @Test
    public void simpleTest() {
        Assert.assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ReversedSequence.reverse(5));
    }

}