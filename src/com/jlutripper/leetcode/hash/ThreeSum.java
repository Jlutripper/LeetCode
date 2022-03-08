package com.jlutripper.leetcode.hash;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int len = nums.length;
        if(len <3) return ans;
        Arrays.sort(nums);
        if(nums[0]>0 || nums[len-1]<0) return ans;
        Map<Integer, Integer> map = new HashMap();
        for(int i=0;i<len;i++){
            if(i+1<len && nums[i+1]==nums[i]) continue;
            map = new HashMap();
            for(int j=i+1;j<len;j++){
                if(j+1<len && nums[j+1]==nums[j]) continue;
                int sum = nums[i] + nums[j];
                if(map.containsKey(-1*sum)){
                    List a = new ArrayList();
                    a.add(nums[i]);
                    a.add(nums[map.get(-1*sum)]);
                    a.add(nums[j]);
                    ans.add(a);
                }
                else map.put(sum,j);
                }
            }
        return ans;
    }
}
