package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Solution;
import org.junit.Test;

public class SolutionTest {
    private static void test(double expected, double[] arrVal, String[] arrUnit) {
        Assert.assertEquals(expected, Solution.solution(arrVal, arrUnit), expected * 1e-5);
    }

    @Test
    public void sampleTests() {
        test(6.67e-12, new double[] {1000, 1000, 100}, new String[] {"g", "kg", "m"});
        test(6.67e-9, new double[] {1000, 1000, 100}, new String[] {"kg", "kg", "m"});
        test(0.0000667, new double[] {1000, 1000, 100}, new String[] {"kg", "kg", "cm"});
    }

}