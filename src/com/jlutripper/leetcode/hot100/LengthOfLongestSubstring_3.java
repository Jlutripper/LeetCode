package com.jlutripper.leetcode.hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: LengthOfLongestSubstring_3
 *
 * @Auther: Jlutripper
 *
 * @Date: 2022/8/12 16:23
 */
public class LengthOfLongestSubstring_3 {
    /**
     * @Description: 无重复字符的最长子串
     *
     * @Param: String
     *
     * @return: int
     *
     * @Author: Jlutripper
     *
     * @Date: 2022/8/12
     */
    public int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        int bef = 0;
        int cur = 0;
        int ans = 1;
        while(cur<c.length){
            char curChar = c[cur];
            if(map.isEmpty() || !map.containsKey(curChar)){
                cur++;
                map.put(curChar,cur);
            }
            else {
                ans = Math.max(cur-bef,ans);
                bef = cur;
            }

        }

        ans = Math.max(cur-bef+1,ans);
        return ans;
    }
}


