package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.SortList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class SortListTest {
    @Test
    public void basicTest() {
        ArrayList<String> sorted = new ArrayList<>();
        ArrayList<String> strs = new ArrayList<>();
        Collections.addAll(strs, "Algebra", "History", "Geometry", "English");
        Collections.addAll(sorted, "Algebra", "English", "Geometry", "History");
        Assert.assertEquals(sorted, SortList.sort(strs));
    }

    @Test
    public void symbolsTest() {
        ArrayList<String> sorted = new ArrayList<>();
        ArrayList<String> strs = new ArrayList<>();
        Collections.addAll(strs, "Alg#bra", "$istory", "Geom^try", "**English");
        Collections.addAll(sorted, "$istory", "**English", "Alg#bra", "Geom^try");
        Assert.assertEquals(sorted, SortList.sort(strs));
    }

}