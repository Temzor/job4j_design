package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.CountingDuplicates;
import org.junit.Test;

public class CountingDuplicatesTest {
    @Test
    public void abcdeReturnsZero() {
        Assert.assertEquals(0, CountingDuplicates.duplicateCount("abcde"));
    }

    @Test
    public void abcdeaReturnsOne() {
        Assert.assertEquals(1, CountingDuplicates.duplicateCount("abcdea"));
    }

    @Test
    public void indivisibilityReturnsOne() {
        Assert.assertEquals(1, CountingDuplicates.duplicateCount("indivisibility"));
    }

    @Test
    public void reallyLongStringContainingDuplicatesReturnsThree() {
        String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A');
        String test1d = new String(new char[1]).replace('\0', 'd');
        String test = test1d + test1CapitalA + testTenC
                + testHundredB + testThousandA;


        Assert.assertEquals(3, CountingDuplicates.duplicateCount(test));
    }

}