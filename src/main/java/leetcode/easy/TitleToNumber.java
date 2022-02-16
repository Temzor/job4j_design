package leetcode.easy;

public class TitleToNumber {
    public int titleToNumber(String columnTitle) {
        if (columnTitle == null) {
            return -1;
        }
        int sum = 0;
        for (char c : columnTitle.toUpperCase().toCharArray()) {
            sum *= 26;
            sum += c - 'A' + 1;
        }
        return sum;
    }
}
