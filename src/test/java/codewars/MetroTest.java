package codewars;

import org.testng.Assert;
import ru.codewars.eightkyu.Metro;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;


public class MetroTest {
    @Test
    public void test1() {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[] {10, 0});
        list.add(new int[] {3, 5});
        list.add(new int[] {2, 5});
        Assert.assertEquals(5, Metro.countPassengers(list));
    }
}