package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Move;
import org.junit.Test;

public class MoveTest {
    @Test
    public void basicTests() {
        Assert.assertEquals(8, Move.move(0, 4));
        Assert.assertEquals(15, Move.move(3, 6));
        Assert.assertEquals(12, Move.move(2, 5));
    }

}