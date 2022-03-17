package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.FindOddCubes;
import org.junit.Test;

public class FindOddCubesTest {
    @Test
    public void testSomething() {

        Assert.assertEquals(0, FindOddCubes.cubeOdd(new int[] {-5, -5, 5, 5}));
        Assert.assertEquals(28, FindOddCubes.cubeOdd(new int[] {1, 2, 3, 4}));
        Assert.assertEquals(0, FindOddCubes.cubeOdd(new int[] {-3, -2, 2, 3}));

    }

}