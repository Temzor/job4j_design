package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.SortAndStar;
import org.junit.Test;

public class SortAndStarTest {

    @Test
    public void testFixed() {
        Assert.assertEquals("b***i***t***c***o***i***n", SortAndStar.twoSort(new String[]
                {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
        Assert.assertEquals("a***r***e", SortAndStar.twoSort(new String[]
                {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
    }

}