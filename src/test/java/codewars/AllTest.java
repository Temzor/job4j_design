package codewars;

import codewars.All;
import org.junit.Test;

import java.util.function.IntPredicate;

import static org.junit.Assert.*;

public class AllTest {
    private static  IntPredicate evenNumber = n -> n % 2 == 0;
    private static  IntPredicate oddNumber = n -> n % 2 != 0;
    private static  IntPredicate lessThan10 = n -> n < 10;
    private static  IntPredicate lessThan5 = n -> n < 5;
    private static  IntPredicate greaterThan1 = n -> n > 1;
    private static  IntPredicate greaterThan5 = n -> n > 5;
    private static  IntPredicate greaterThan10 = n -> n > 10;

    @Test
    public void fixedTests() {
        assertTrue(All.all(new int[]{2, 4, 6, 10}, evenNumber));
        assertFalse(All.all(new int[]{1, 3, 5, 10}, oddNumber));
        assertFalse(All.all(new int[]{2, 4, 6, 19}, lessThan10));
        assertTrue(All.all(new int[]{1, 1, 2}, lessThan5));
        assertTrue(All.all(new int[]{2, 9, 4, 3}, greaterThan1));
        assertFalse(All.all(new int[]{2, 9, 4, 0}, greaterThan1));
        assertFalse(All.all(new int[]{5, 6, 7, 8}, greaterThan5));
        assertTrue(All.all(new int[]{13, 42}, greaterThan10));

        assertFalse(All.all(new int[]{5}, evenNumber));
        assertTrue(All.all(new int[]{5}, oddNumber));
        assertFalse(All.all(new int[]{5}, lessThan5));

        assertTrue(All.all(new int[]{}, evenNumber));
        assertTrue(All.all(new int[]{}, lessThan5));
        assertTrue(All.all(new int[]{}, greaterThan10));
    }

}