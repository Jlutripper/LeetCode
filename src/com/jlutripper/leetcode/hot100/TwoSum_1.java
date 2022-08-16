package com.jlutripper.leetcode.hot100;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(map.size()==0 || !map.containsKey(nums[i])){
                map.put(target-nums[i],i);
            }
            else return new int[] {map.get(nums[i]),i};
        }
        return new int[2];
    }
}
