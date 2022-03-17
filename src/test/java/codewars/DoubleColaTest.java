package codewars;

import ru.codewars.eightkyu.DoubleCola;
import org.junit.Assert;
import org.junit.Test;

public class DoubleColaTest {
    @Test
    public void test1() {
        String[] names = new String[] {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        int n = 1;
        Assert.assertEquals("Sheldon", DoubleCola.whoIsNext(names, n));
    }
    @Test
    public void test2() {
        String[] names = new String[] {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        int n = 6;
        Assert.assertEquals("Sheldon", DoubleCola.whoIsNext(names, n));
    }

    @Test
    public void test3() {
        String[] names = new String[] {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        int n = 52;
        Assert.assertEquals("Penny", DoubleCola.whoIsNext(names, n));
    }
}