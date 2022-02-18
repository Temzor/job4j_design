package ru.leetcode.easy;

public class RomanToInt {
    public int romanToInt(String s) {
        String symbols = "IVXLCDM";
        int[] values = {1, 5, 10, 50, 100, 500, 1000};

        int returnValue = 0;
        int previousIndex = -1;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentIndex = symbols.indexOf(s.charAt(i));

            if (currentIndex < previousIndex) {
                returnValue -= values[currentIndex];
            } else {
                returnValue += values[currentIndex];
            }
            previousIndex = currentIndex;
        }

        return returnValue;
    }
}