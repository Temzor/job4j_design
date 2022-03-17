package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Capitalize;
import org.junit.Test;

public class CapitalizeTest {
    @Test
    public void basicTests() {
        Assert.assertArrayEquals(new String[]{"AbCdEf", "aBcDeF"}, Capitalize.capitalize("abcdef"));
        Assert.assertArrayEquals(new String[]{"CoDeWaRs", "cOdEwArS"}, Capitalize.capitalize("codewars"));
        Assert.assertArrayEquals(new String[]{"AbRaCaDaBrA", "aBrAcAdAbRa"}, Capitalize.capitalize("abracadabra"));
        Assert.assertArrayEquals(new String[]{"CoDeWaRrIoRs", "cOdEwArRiOrS"}, Capitalize.capitalize("codewarriors"));
    }

}