package codewars;

import codewars.DescribeAge;
import org.junit.Test;

import static org.junit.Assert.*;

public class DescribeAgeTest {
    @Test
    public void basicTests() {
        assertEquals("You're a(n) kid", DescribeAge.describeAge(9));
        assertEquals("You're a(n) kid", DescribeAge.describeAge(10));
        assertEquals("You're a(n) kid", DescribeAge.describeAge(11));
        assertEquals("You're a(n) kid", DescribeAge.describeAge(12));
        assertEquals("You're a(n) teenager", DescribeAge.describeAge(13));
        assertEquals("You're a(n) teenager", DescribeAge.describeAge(14));
        assertEquals("You're a(n) teenager", DescribeAge.describeAge(15));
        assertEquals("You're a(n) teenager", DescribeAge.describeAge(16));
        assertEquals("You're a(n) teenager", DescribeAge.describeAge(17));
        assertEquals("You're a(n) adult", DescribeAge.describeAge(18));
        assertEquals("You're a(n) adult", DescribeAge.describeAge(19));
        assertEquals("You're a(n) adult", DescribeAge.describeAge(63));
        assertEquals("You're a(n) adult", DescribeAge.describeAge(64));
        assertEquals("You're a(n) elderly", DescribeAge.describeAge(65));
        assertEquals("You're a(n) elderly", DescribeAge.describeAge(66));
        assertEquals("You're a(n) elderly", DescribeAge.describeAge(100));
    }

}