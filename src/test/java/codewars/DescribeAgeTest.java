package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.DescribeAge;
import org.junit.Test;

public class DescribeAgeTest {
    @Test
    public void basicTests() {
        Assert.assertEquals("You're a(n) kid", DescribeAge.describeAge(9));
        Assert.assertEquals("You're a(n) kid", DescribeAge.describeAge(10));
        Assert.assertEquals("You're a(n) kid", DescribeAge.describeAge(11));
        Assert.assertEquals("You're a(n) kid", DescribeAge.describeAge(12));
        Assert.assertEquals("You're a(n) teenager", DescribeAge.describeAge(13));
        Assert.assertEquals("You're a(n) teenager", DescribeAge.describeAge(14));
        Assert.assertEquals("You're a(n) teenager", DescribeAge.describeAge(15));
        Assert.assertEquals("You're a(n) teenager", DescribeAge.describeAge(16));
        Assert.assertEquals("You're a(n) teenager", DescribeAge.describeAge(17));
        Assert.assertEquals("You're a(n) adult", DescribeAge.describeAge(18));
        Assert.assertEquals("You're a(n) adult", DescribeAge.describeAge(19));
        Assert.assertEquals("You're a(n) adult", DescribeAge.describeAge(63));
        Assert.assertEquals("You're a(n) adult", DescribeAge.describeAge(64));
        Assert.assertEquals("You're a(n) elderly", DescribeAge.describeAge(65));
        Assert.assertEquals("You're a(n) elderly", DescribeAge.describeAge(66));
        Assert.assertEquals("You're a(n) elderly", DescribeAge.describeAge(100));
    }

}