package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.BlueAndRedMarbles;
import org.junit.Test;

public class BlueAndRedMarblesTest {

    final double epsilon = 0.0000001;

    @Test
    public void pulledTest1() {
        Assert.assertEquals(0.6, BlueAndRedMarbles.guessBlue(5, 5, 2, 3), epsilon);
    }

    @Test public void pulledTest2() {
        Assert.assertEquals(0.2, BlueAndRedMarbles.guessBlue(5, 7, 4, 3), epsilon);
    }

}