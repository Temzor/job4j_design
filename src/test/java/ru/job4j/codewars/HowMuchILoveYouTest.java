package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class HowMuchILoveYouTest {
    @Test
    public void test1() {
        assertEquals("I love you", HowMuchILoveYou.howMuchILoveYou(1));
        assertEquals("a little", HowMuchILoveYou.howMuchILoveYou(2));
        assertEquals("not at all", HowMuchILoveYou.howMuchILoveYou(6));
    }

}