package ru.codewars.sevenkyu;

import org.junit.Assert;
import org.junit.Test;

public class GiftSorterTest {

    @Test
    public void thenFourWord() {
        GiftSorter giftSorter = new GiftSorter();
        String input = "dbca";
        String expect = "abcd";
        Assert.assertEquals(expect, giftSorter.sortGiftCode(input));
    }

    @Test
    public void thenFiveWord() {
        GiftSorter giftSorter = new GiftSorter();
        String input = "dbcaf";
        String expect = "abcdf";
        Assert.assertEquals(expect, giftSorter.sortGiftCode(input));
    }
}