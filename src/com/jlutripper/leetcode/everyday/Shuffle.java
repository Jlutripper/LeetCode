package com.jlutripper.leetcode.everyday;

/**
 * @description: 1470. 重新排列数组
 * @author: Jlutripper
 * @create: 2022-08-29 11:37
 **/


public class Shuffle {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
        }
        int loc = 1;
        for (int i = n; i < 2 * n; i++) {
            ans[loc] = nums[i];
            loc += 2;
        }
        return ans;
    }
}
