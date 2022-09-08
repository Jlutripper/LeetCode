package com.jlutripper.leetcode.ds.search;

/**
 * @description: 704. 二分查找
 * @author: Jlutripper
 * @create: 2022-08-25 21:27
 **/


public class BiSearch {
    /**
     * @Param: [int[], int]
     * @return: int
     * @Description: 如果目标值存在返回下标，否则返回 -1。
     * @Author: Jlutripper
     * @Date: 2022/8/25 21:28
     */
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int loc = (left+right)/2;
            if(nums[loc]==target) return loc;
            if(nums[loc]>target) right = loc - 1;
            if(nums[loc]<target) left = loc + 1;
        }
        return -1;
    }

//    public int searchInsert(int[] nums, int target) {
//
//    }
}
