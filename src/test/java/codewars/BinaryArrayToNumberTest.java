package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.BinaryArrayToNumber;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryArrayToNumberTest {
    @org.junit.Test
    public void convertBinaryArrayToInt() {

        Assert.assertEquals(1, BinaryArrayToNumber.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 0, 0, 1))));
        Assert.assertEquals(15, BinaryArrayToNumber.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 1, 1, 1))));
        Assert.assertEquals(6, BinaryArrayToNumber.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 1, 1, 0))));
        Assert.assertEquals(9, BinaryArrayToNumber.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 0, 0, 1))));


    }

}