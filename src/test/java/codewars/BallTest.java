package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Ball;
import org.junit.Test;

import static org.junit.Assert.*;

public class BallTest {
    private static void testing(int actual, int expected) {
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test() {
        System.out.println("Fixed Tests maxBall");
        testing(Ball.maxBall(37), 10);
        testing(Ball.maxBall(45), 13);
        testing(Ball.maxBall(99), 28);
        testing(Ball.maxBall(85), 24);
    }

}