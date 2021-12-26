package leetcode.easy;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (i >= 0 && digits[i] == 9) {
            digits[i] = 0; i--;
        }
        if (i >= 0) {
            digits[i] += 1;
            return digits;
        }

        int[] newDigits = new int[digits.length + 1];

        newDigits[0] = 1;

        return newDigits;
    }
}

