package com.jlutripper.leetcode.array;
import java.util.Arrays;

public class MinSubArrayLen {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        if(len==0) return 0;
        int[] sum = new int[len+1];
        sum[0] = 0;
        int ans = Integer.MAX_VALUE;
        for(int i=1;i<len+1;i++){
            sum[i] = sum[i-1] + nums[i-1];
        }
        for(int i=1;i<len+1;i++){
            int newTarget = target + sum[i];
            int bound = Arrays.binarySearch(sum, newTarget);
            if (bound < 0) {
                bound = -bound - 1;
            }
            if (bound <= len) {
                ans = Math.min(ans, bound - (i - 1));
            }
        }
        return ans==Integer.MAX_VALUE ? 0 :ans;
    }
}
