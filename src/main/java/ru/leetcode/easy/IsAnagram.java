package ru.leetcode.easy;

import java.util.Arrays;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sortS = s.toCharArray();
        char[] sortT = t.toCharArray();

        Arrays.sort(sortS);
        Arrays.sort(sortT);

        for (int i = 0; i < sortS.length; i++) {
            if (sortS[i] != sortT[i]) {
                return false;
            }
        }
        return true;
    }
}
