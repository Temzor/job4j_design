package codewars;

import org.testng.Assert;
import ru.codewars.sevenkyu.ReversedStrings;
import org.junit.Test;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class ReversedStringsTest {
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    @Test
    public void sampleTests() {
        Assert.assertEquals("dlrow", ReversedStrings.solution("world"));
        Assert.assertEquals("olleh", ReversedStrings.solution("hello"));
        Assert.assertEquals("", ReversedStrings.solution(""));
        Assert.assertEquals("h", ReversedStrings.solution("h"));
        Assert.assertEquals("selur srawedoC", ReversedStrings.solution("Codewars rules"));
    }

    @Test
    public void randomTests() {
        String chars = "abcdefghijklmnopqrstuvwxyz    ,./';123456789!?";
        Random random = new Random();

        for (int i = 0; i < 100; ++i) {
            String test = IntStream.range(1, random.nextInt(100))
                    .mapToObj(x -> Character.toString(chars.charAt(random.nextInt(chars.length()))))
                    .collect(Collectors.joining());

            String expected = solution(test);
            String actual = ReversedStrings.solution(test);

            Assert.assertEquals(expected, actual);
        }
    }
}