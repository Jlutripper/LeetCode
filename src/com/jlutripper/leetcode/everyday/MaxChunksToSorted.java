package com.jlutripper.leetcode.everyday;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/**
 * @ClassName: MaxChunksToSorted
 * @Auther: Jlutripper
 * @Date: 2022/8/13 09:47
 */

public class MaxChunksToSorted {
    /**
     * @Description: "769. 最多能完成排序的块"
     * @Param: [arr]
     * @return: int
     * @Author: Jlutripper
     * @Date: 2022/8/13
     */

    public int maxChunksToSorted(int[] arr) {
        int ans = 0, max = 0;
        for (int i = 0; i < arr.length; ++i) {
            max = Math.max(max, arr[i]);
            if (max == i) ans++;
        }
        return ans;
    }
}


