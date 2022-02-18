package leetcode.easy;


import org.junit.Assert;
import org.junit.Test;
import ru.leetcode.easy.AddBinary;

public class AddBinaryTest {
    @Test
    public void testOne() {
        AddBinary addBinary = new AddBinary();
        String a = "11";
        String b = "1";
        Assert.assertEquals("100", addBinary.addBinary(a, b));
    }

    @Test
    public void testTwo() {
        AddBinary addBinary = new AddBinary();
        String a = "1010";
        String b = "1011";
        Assert.assertEquals("10101", addBinary.addBinary(a, b));
    }

}