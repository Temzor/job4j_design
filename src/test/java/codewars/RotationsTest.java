package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Rotations;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class RotationsTest {
    private static void testing(Boolean actual, Boolean expected) {
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests containAllRots");
        testing(Rotations.containAllRots("", Collections.emptyList()), true);
        List<String> a = Arrays.asList("bsjq", "qbsj");
        testing(Rotations.containAllRots("", a), true);
        a = Arrays.asList("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs");
        testing(Rotations.containAllRots("bsjq", a), true);
        a = Arrays.asList("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY");
        testing(Rotations.containAllRots("XjYABhR", a), false);
    }

}