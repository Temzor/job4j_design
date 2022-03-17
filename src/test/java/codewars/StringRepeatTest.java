package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.StringRepeat;
import org.junit.Test;

import java.util.Random;

public class StringRepeatTest {
    @Test public void test4a() {
        Assert.assertEquals("aaaa", StringRepeat.repeatStr(4, "a"));
    }
    @Test public void test3Hello() {
        Assert.assertEquals("HelloHelloHello", StringRepeat.repeatStr(3, "Hello"));
    }
    @Test public void test5empty() {
        Assert.assertEquals("", StringRepeat.repeatStr(5, ""));
    }
    @Test public void test0a() {
        Assert.assertEquals("", StringRepeat.repeatStr(0, "kata"));
    }

    private final char[] characters =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQERSTUVWXYZ0123456789!@#$%^&*()-=_+[]{}|;:,.<>/?`~"
                    .toCharArray();

    @Test public void testRandom() {
        final Random rand = new Random();
        for (int testIteration = 0; testIteration < 10; ++testIteration) {
            final StringBuilder text = new StringBuilder(rand.nextInt(32));
            for (int i = 0; i < text.capacity(); ++i) {
                final int chi = rand.nextInt(characters.length);
                text.append(characters[chi]);
            }
            final String string = text.toString();

            final int timesToRepeat = rand.nextInt(32);
            final String expected = String.valueOf(text).repeat(timesToRepeat);

            Assert.assertEquals(expected, StringRepeat.repeatStr(timesToRepeat, string));
        }
    }

    @Test public void test4a1() {
        Assert.assertEquals("aaaa", StringRepeat.repeatStr1(4, "a"));
    }
    @Test public void test3Hello1() {
        Assert.assertEquals("HelloHelloHello", StringRepeat.repeatStr1(3, "Hello"));
    }
    @Test public void test5empty1() {
        Assert.assertEquals("", StringRepeat.repeatStr1(5, ""));
    }
    @Test public void test0a1() {
        Assert.assertEquals("", StringRepeat.repeatStr1(0, "kata"));
    }

    private final char[] characters1 =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQERSTUVWXYZ0123456789!@#$%^&*()-=_+[]{}|;:,.<>/?`~"
                    .toCharArray();

    @Test public void testRandom1() {
        final Random rand = new Random();
        for (int testIteration = 0; testIteration < 10; ++testIteration) {
            final StringBuilder text = new StringBuilder(rand.nextInt(32));
            for (int i = 0; i < text.capacity(); ++i) {
                final int chi = rand.nextInt(characters1.length);
                text.append(characters1[chi]);
            }
            final String string = text.toString();

            final int timesToRepeat = rand.nextInt(32);
            final String expected = String.valueOf(text).repeat(timesToRepeat);

            Assert.assertEquals(expected, StringRepeat.repeatStr1(timesToRepeat, string));
        }
    }
}