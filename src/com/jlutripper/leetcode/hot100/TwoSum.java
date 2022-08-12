package com.jlutripper.leetcode.hot100;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key = nums[i];
            if(map.containsKey(key)) return new int[] {i,map.get(key)};
            else map.put(target-key,i);

        }
        return new int[] {-1};
    }
}
