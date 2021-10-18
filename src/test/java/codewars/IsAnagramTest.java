package codewars;

import codewars.IsAnagram;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsAnagramTest {
    @Test
    public void exampleTests() {
        assertTrue(IsAnagram.isAnagram("foefet", "toffee"));
        assertTrue(IsAnagram.isAnagram("Buckethead", "DeathCubeK"));
        assertTrue(IsAnagram.isAnagram("Twoo", "Woot"));
        assertFalse(IsAnagram.isAnagram("apple", "pale"));
    }

}