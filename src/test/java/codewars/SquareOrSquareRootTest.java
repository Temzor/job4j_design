package codewars;

import org.testng.Assert;
import ru.codewars.eightkyu.SquareOrSquareRoot;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SquareOrSquareRootTest {
    @Test
    public void basicTests() {
        int[] input = new int[] {4, 3, 9, 7, 2, 1 };
        int[] expected = new int[] {2, 9, 3, 49, 4, 1 };
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(SquareOrSquareRoot.squareOrSquareRoot(input)));

        input = new int[] {100, 101, 5, 5, 1, 1 };
        expected = new int[] {10, 10201, 25, 25, 1, 1 };
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(SquareOrSquareRoot.squareOrSquareRoot(input)));

        input = new int[] {1, 2, 3, 4, 5, 6 };
        expected = new int[] {1, 4, 9, 2, 25, 36 };
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(SquareOrSquareRoot.squareOrSquareRoot(input)));
    }


}