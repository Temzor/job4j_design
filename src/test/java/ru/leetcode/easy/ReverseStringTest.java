package ru.leetcode.easy;

import org.junit.Test;

import java.util.Arrays;

public class ReverseStringTest {

    @Test
    public void thenHello() {
        ReverseString reverseString = new ReverseString();
        char[] input = new char[] {'h', 'e', 'l', 'l', 'o'};
        char[] expect = new char[] {'o', 'l', 'l', 'e', 'h'};
        Arrays.equals(expect, reverseString.reverseString(input));
    }

}