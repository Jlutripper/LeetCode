package com.jlutripper.leetcode.everyday;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @description: 1464. 数组中两元素的最大乘积
 * @author: Jlutripper
 * @create: 2022-08-26 19:14
 **/


public class MaxProduct {
    /**
     * @Param: [int[]]
     * @return: int
     * @Description: 给你一个整数数组 nums，请你选择数组的两个不同下标 i 和 j，使 (nums[i]-1)*(nums[j]-1) 取得最大值。
     * @Author: Jlutripper
     * @Date: 2022/8/26 19:14
     */
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int ans1 = (nums[0]-1) * (nums[1]-1);
        int ans2 = (nums[len-1]-1) * (nums[len-2]-1);
        return Math.max(ans1,ans2);
    }


}
