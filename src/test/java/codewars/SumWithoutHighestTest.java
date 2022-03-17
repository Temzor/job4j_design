package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.SumWithoutHighest;
import org.junit.Test;

import java.util.Arrays;

public class SumWithoutHighestTest {
    @Test
    public void basicTests() {
        Assert.assertEquals(16, SumWithoutHighest.sum(new int[] {6, 2, 1, 8, 10}));
    }

    @Test
    public void sumOnlyOneElement() {
        Assert.assertEquals(0, SumWithoutHighest.sum(new int[] {6}));
    }

    @Test
    public void sumOnlyTwoElements() {
        Assert.assertEquals(0, SumWithoutHighest.sum(new int[] {6, 7}));
    }

    @Test
    public void sumPositives() {
        Assert.assertEquals(16, SumWithoutHighest.sum(new int[] {6, 2, 1, 8, 10}));
    }

    @Test
    public void sumPositivesWithDoubleMax() {
        Assert.assertEquals(17, SumWithoutHighest.sum(new int[] {6, 0, 1, 10, 10}));
    }

    @Test
    public void sumNegatives() {
        Assert.assertEquals(-28, SumWithoutHighest.sum(new int[] {-6, -20, -1, -10, -12}));
    }

    @Test
    public void sumMixed() {
        Assert.assertEquals(3, SumWithoutHighest.sum(new int[] {-6, 20, -1, 10, -12}));
    }

    @Test
    public void sumEmptyArray() {
        Assert.assertEquals(0, SumWithoutHighest.sum(new int[0]));
    }

    @Test
    public void sumNullArray() {
        Assert.assertEquals(0, SumWithoutHighest.sum(null));
    }

    @Test
    public void sumRandom() {
        for (int r = 0; r < 20; r++) {
            int[] numbers = new int[6];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = (int) Math.floor(Math.random() * 1100 - 500);
            }
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }

            int min = Arrays.stream(numbers).min().getAsInt();
            int max = Arrays.stream(numbers).max().getAsInt();

            int expected = sum - min - max;

            Assert.assertEquals(expected, SumWithoutHighest.sum(numbers));
        }
    }

}