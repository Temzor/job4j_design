package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.RowSumOddNumbers;
import org.junit.Test;

public class RowSumOddNumbersTest {
    @Test
    public void test1() {
        Assert.assertEquals(1, RowSumOddNumbers.rowSumOddNumbers(1));
        Assert.assertEquals(74088, RowSumOddNumbers.rowSumOddNumbers(42));
    }

}