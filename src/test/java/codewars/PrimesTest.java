package codewars;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PrimesTest {
    @Test
    public void test010() {
        test(0, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
    }

    @Test
    public void test1010() {
        test(10, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71);
    }

    @Test
    public void test10010() {
        test(100, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601);
    }

    @Test
    public void test100010() {
        test(1000, 7927, 7933, 7937, 7949, 7951, 7963, 7993, 8009, 8011, 8017);
    }

    private void test(int skip, int... expect) {
        int[] found = Primes.stream().skip(skip).limit(10).toArray();
        assertArrayEquals(expect, found);
    }

}