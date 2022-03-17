package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Invert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InvertTest {
    @Test
    public void testSomething() {

        int[] input = new int[] {-1, -2, -3, -4, -5};
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(Invert.invert(input)));

        input = new int[] {-1, 2, -3, 4, -5};
        expected = new int[] {1, -2, 3, -4, 5};
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(Invert.invert(input)));

        input = new int[] {};
        expected = new int[] {};
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(Invert.invert(input)));

        input = new int[] {0};
        expected = new int[] {0};
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(Invert.invert(input)));
    }

}