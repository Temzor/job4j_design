package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.PredictAge;
import org.junit.Test;

public class PredictAgeTest {
    @Test
    public void fixedTests() {
        Assert.assertEquals(86, PredictAge.predictAge(65, 60, 75, 55, 60, 63, 64, 45));
        Assert.assertEquals(79, PredictAge.predictAge(32, 54, 76, 65, 34, 63, 64, 45));
    }


}