package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.WhoLikesIt;
import org.junit.Test;

public class WhoLikesItTest {
    @Test
    public void staticTests() {
        Assert.assertEquals("no one likes this", WhoLikesIt.whoLikesIt());
        Assert.assertEquals("Peter likes this", WhoLikesIt.whoLikesIt("Peter"));
        Assert.assertEquals("Jacob and Alex like this", WhoLikesIt.whoLikesIt("Jacob", "Alex"));
        Assert.assertEquals("Max, John and Mark like this", WhoLikesIt.whoLikesIt("Max", "John", "Mark"));
        Assert.assertEquals("Alex, Jacob and 2 others like this", WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }

}