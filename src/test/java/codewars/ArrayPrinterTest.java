package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.ArrayPrinter;
import org.junit.Test;

public class ArrayPrinterTest {
    @Test
    public void testInteger() {
        Integer[] array = new Integer[]{2, 4, 5, 2};
        Assert.assertEquals("2,4,5,2", ArrayPrinter.printArray(array));
    }

}