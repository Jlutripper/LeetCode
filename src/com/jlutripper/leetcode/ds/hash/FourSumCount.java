package com.jlutripper.leetcode.ds.hash;

import java.util.HashMap;
import java.util.Map;

public class FourSumCount {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int a:nums1){
            for(int b:nums2){
                int tmp = a + b;
                if(map.containsKey(tmp)){
                    map.put(tmp,map.get(tmp)+1);
                }
                else{
                    map.put(tmp,1);
                }
            }
        }
        for(int c:nums3){
            for(int d:nums4){
                int target = -(c+d);
                if(map.containsKey(target)){
                    ans += map.get(target);
                }
            }
        }
        return ans;
    }
}
