package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.LargestFiveDigitNumber;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class LargestFiveDigitNumberTest {
    @Test
    public void exampleTests() {
        Assert.assertEquals(83910, LargestFiveDigitNumber.solve("283910"));
        Assert.assertEquals(67890, LargestFiveDigitNumber.solve("1234567890"));
    }

}