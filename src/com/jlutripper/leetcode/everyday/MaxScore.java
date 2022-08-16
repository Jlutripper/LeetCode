package com.jlutripper.leetcode.everyday;

/**
 * @ClassName: MaxScore
 * @Auther: Jlutripper
 * @Date: 2022/8/14 11:13
 */

public class MaxScore {
    /**
     * @Description: 1422. 分割字符串的最大得分
     * @Param: [s]
     * @return: int
     * @Author: Jlutripper
     * @Date: 2022/8/14
     */
    public int maxScore(String s) {
        char[] charArr = s.toCharArray();
        int score = 0;
        int n = s.length();
        int cur = 0;

        if(charArr[0] == '0') score++;
        for(int i = 1; i < n; i++){
            if(charArr[i] == '1') score++;
        }

        int ans = score;

        for(int i = 1; i < n; i++){
            if(charArr[i]=='0') score++;
            else score--;
            score = Math.max(score,ans);
        }
        return ans;
    }
}


