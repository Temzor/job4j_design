package ru.leetcode.easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }

        Arrays.sort(strings);
        String first = strings[0];
        String last = strings[strings.length - 1];
        int c = 0;
        while (c < first.length()) {
            if (first.charAt(c) == last.charAt(c)) {
                c++;
            } else {
                break;
            }
        }
        return c == 0 ? "" : first.substring(0, c);
    }
}
