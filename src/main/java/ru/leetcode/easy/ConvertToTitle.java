package ru.leetcode.easy;

public class ConvertToTitle {
    public String convertToTitle(int columnNumber) {
        return columnNumber == 0 ? "" : convertToTitle(--columnNumber / 26)
                + (char) ('A' + (columnNumber % 26));
    }
}
