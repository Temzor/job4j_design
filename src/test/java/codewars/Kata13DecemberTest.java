package codewars;

import org.testng.Assert;
import ru.codewars.eightkyu.Kata13December;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Kata13DecemberTest {
    @Test
    public void firstTest() {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList(1, 2, 2, 2, 4, 3, 4, 5, 6, 7));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList(1, 3, 5, 7));
        Assert.assertEquals(expectedResult, Kata13December.filterOddNumber(listOfNumbers));
    }

    @Test
    public void secondTest() {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList(1, 2, 2, 2, 4, 3, 4));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList(1, 3));
        Assert.assertEquals(Arrays.toString(expectedResult.toArray()), Arrays.toString(Kata13December.filterOddNumber(listOfNumbers).toArray()));
    }

}