package ru.job4j.codewars;

import org.junit.Test;

import java.security.SecureRandom;
import java.util.Random;

import static org.junit.Assert.*;

public class RemoveCharsTest {

    @Test
    public void testRemoval() {
        assertEquals("loquen", RemoveChars.remove("eloquent"));
        assertEquals("ountr", RemoveChars.remove("country"));
        assertEquals("erso", RemoveChars.remove("person"));
        assertEquals("lac", RemoveChars.remove("place"));
    }

    @Test
    public void testRemovalWithRandomString() {
        for (int i = 0; i < 6; i++) {
            String randStr = randomString(RANDOM.nextInt(21) + 10);
            assertEquals(removeChars(randStr), RemoveChars.remove(randStr));
        }
    }

    private static final Random RANDOM = new SecureRandom();

    private static String removeChars(String str) {
        return str.substring(1, str.length() - 1);
    }

    private static String randomString(int len) {
        StringBuilder sb = new StringBuilder();

        while (len > 0) {
            // char from '!' to '~'
            sb.append((char) (RANDOM.nextInt(94) + 33));
            len--;
        }

        return sb.toString();
    }
}
