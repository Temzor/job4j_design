package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.RemoveChars;
import org.junit.Test;

import java.security.SecureRandom;
import java.util.Random;

public class RemoveCharsTest {

    @Test
    public void testRemoval() {
        Assert.assertEquals("loquen", RemoveChars.remove("eloquent"));
        Assert.assertEquals("ountr", RemoveChars.remove("country"));
        Assert.assertEquals("erso", RemoveChars.remove("person"));
        Assert.assertEquals("lac", RemoveChars.remove("place"));
    }

    @Test
    public void testRemovalWithRandomString() {
        for (int i = 0; i < 6; i++) {
            String randStr = randomString(RANDOM.nextInt(21) + 10);
            Assert.assertEquals(removeChars(randStr), RemoveChars.remove(randStr));
        }
    }

    private static final Random RANDOM = new SecureRandom();

    private static String removeChars(String str) {
        return str.substring(1, str.length() - 1);
    }

    private static String randomString(int len) {
        StringBuilder sb = new StringBuilder();

        while (len > 0) {
            sb.append((char) (RANDOM.nextInt(94) + 33));
            len--;
        }

        return sb.toString();
    }
}
