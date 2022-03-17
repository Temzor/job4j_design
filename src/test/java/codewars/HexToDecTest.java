package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.HexToDec;
import org.junit.Test;

public class HexToDecTest {
    @Test
    public void examples() {
        Assert.assertEquals(1, HexToDec.hexToDec("1"));
        Assert.assertEquals(10, HexToDec.hexToDec("a"));
        Assert.assertEquals(16, HexToDec.hexToDec("10"));
        Assert.assertEquals(255, HexToDec.hexToDec("FF"));
        Assert.assertEquals(-12, HexToDec.hexToDec("-C"));
    }

}