package com.jlutripper.leetcode.everyday;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @description: 646. 最长数对链
 * @author: Jlutripper
 * @create: 2022-09-03 15:19
 **/


public class FindLongestChain {
    /**
     * @Param: [int[][]]
     * @return: int
     * @Description: 给出n个数对。在每一个数对中，第一个数字总是比第二个数字小。
     * 现在，我们定义一种跟随关系，当且仅当b < c时，数对(c, d)才可以跟在(a, b)后面。我们用这种形式来构造一个数对链。
     * 给定一个数对集合，找出能够形成的最长数对链的长度。你不需要用到所有的数对，你可以以任何顺序选择其中的一些数对来构造。
     * @Author: Jlutripper
     * @Date: 2022/9/3 15:19
     */
    public int findLongestChain(int[][] pairs) {
        int[] dp = new int[pairs.length];
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[0]));
        Arrays.fill(dp, 1);
        for (int i = 0; i < pairs.length; i++) {
            for (int j = 0; j < i; j++) {
                if (pairs[i][0] > pairs[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[pairs.length - 1];
    }

    public static void main(String[] args) {
        int[][] pairs = new int[][] {{1,2},{2,3},{3,4}};
        new FindLongestChain().findLongestChain(pairs);
    }
}
