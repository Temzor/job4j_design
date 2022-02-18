package ru.leetcode.easy;

import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int middle = nums.length / 2;
        return nums[middle] == nums[middle + 1] || nums[middle] == nums[middle - 1]
                ? nums[middle] : nums[middle - 1];
    }
}
