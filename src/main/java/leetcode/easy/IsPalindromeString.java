package leetcode.easy;

public class IsPalindromeString {
    public boolean isPalindromeString(String s) {
        String straight = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reverse = new StringBuffer(straight).reverse().toString();
        return straight.equals(reverse);
    }
}
