package ru.leetcode.easy;

public class MoveZeroes {
    public int[] moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }
        int last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[++last] = nums[i];
                if (i != last) {
                    nums[i] = 0;
                }
            }
        }
        return nums;
    }
}
