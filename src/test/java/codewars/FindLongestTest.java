package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.FindLongest;
import org.junit.Test;

public class FindLongestTest {

    @Test
    public void basicTests() {
        Assert.assertEquals(7, FindLongest.findLongest("The quick white fox jumped around the massive dog"));
        Assert.assertEquals(10, FindLongest.findLongest("Take me to tinseltown with you"));
        Assert.assertEquals(7, FindLongest.findLongest("Sausage chops"));
        Assert.assertEquals(6, FindLongest.findLongest("Wind your body and wiggle your belly"));
        Assert.assertEquals(7, FindLongest.findLongest("Lets all go on holiday"));
    }

}