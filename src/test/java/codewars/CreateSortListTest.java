package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.CreateList;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class CreateSortListTest {
    @Test
    public void sampleTests() {
        Assert.assertEquals(Collections.singletonList(1), CreateList.createList(1));
        Assert.assertEquals(Arrays.asList(1, 2),
                CreateList.createList(2));
        Assert.assertEquals(Arrays.asList(1, 2, 3), CreateList.createList(3));
        Assert.assertEquals(Arrays.asList(1, 2, 3, 4), CreateList.createList(4));
        Assert.assertEquals(Arrays.asList(1, 2, 3, 4, 5), CreateList.createList(5));
    }

}