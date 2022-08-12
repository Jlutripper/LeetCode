package com.jlutripper.leetcode.hot100;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        int ans = 0;
        int from = 0;
        for(int i=0;i<c.length;i++){
            if(map.isEmpty()) map.put(c[i],i);
            else {
                if(map.containsKey(c[i])){
                    int cur = map.get(c[i]) + 1;
                    for(int j=from;j<cur;j++) map.remove(c[j]);
                    from = cur;
                }
                map.put(c[i],i);
            }
            ans = Math.max(map.size(),ans);
        }
        return ans;
    }
}
