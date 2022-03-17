package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Averages;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AveragesTest {
    @Test
    public void basicTests() {
        Assert.assertEquals(Arrays.toString(new double[] {2, 2, 2, 2 }), Arrays.toString(Averages.averages(new int[] {2, 2, 2, 2, 2 })));
        Assert.assertEquals(Arrays.toString(new double[] {0, 0, 0, 0 }), Arrays.toString(Averages.averages(new int[] {2, -2, 2, -2, 2 })));
        Assert.assertEquals(Arrays.toString(new double[] {2, 4, 3, -4.5 }), Arrays.toString(Averages.averages(new int[] {1, 3, 5, 1, -10 })));
    }

}