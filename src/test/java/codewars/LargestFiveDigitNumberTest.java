package codewars;

import codewars.LargestFiveDigitNumber;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class LargestFiveDigitNumberTest {
    @Test
    public void exampleTests() {
        assertEquals(83910, LargestFiveDigitNumber.solve("283910"));
        assertEquals(67890, LargestFiveDigitNumber.solve("1234567890"));
    }

}