package ru.leetcode.easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        String result = split[split.length - 1].trim();
        return result.length();
    }
}
