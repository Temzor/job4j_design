package ru.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class IsAnagramTest {

    @Test
    public void thenAnagram() {
        IsAnagram isAnagram = new IsAnagram();
        String anagram = "anagram";
        String result = "nagaram";
        Assert.assertTrue(String.valueOf(true), isAnagram.isAnagram(anagram, result));
    }

    @Test
    public void thenNotAnagram() {
        IsAnagram isAnagram = new IsAnagram();
        String anagram = "anagram";
        String result = "nagaramm";
        Assert.assertFalse(String.valueOf(false), isAnagram.isAnagram(anagram, result));
    }

    @Test
    public void thenNotAnagramCat() {
        IsAnagram isAnagram = new IsAnagram();
        String anagram = "rat";
        String result = "cat";
        Assert.assertFalse(String.valueOf(false), isAnagram.isAnagram(anagram, result));
    }
}