package com.jlutripper.exam;

import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

/**
 * @description:
 * @author: Jlutripper
 * @create: 2022-08-26 20:19
 **/


public class Microsoft2 {

    public static void main(String[] args) {
        int[] A = {-3,-2,1,0,8,7,1};
        System.out.println(new Microsoft2().solution2(A,4));
    }

    /**
     * @Param: [int[], int[]]
     * @return: int
     * @Description: 找出合并后数组中不存在数字的最小值
     * @Author: Jlutripper
     * @Date: 2022/8/26 21:53
     */
    public int solution3(int[] A, int[] B) {
        HashSet<Integer> hashSet = new HashSet<>();
        int len = A.length;
        int[] C = new int[len];
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B[i]) hashSet.add(A[i]);
            C[i] = A[i];
        }
        for (int i = 0; i < A.length; i++) {
            if (C[i] == 0) {
                if (!(hashSet.contains(A[i]) || hashSet.contains(B[i]))) hashSet.add(Math.max(A[i], B[i]));
            }
        }
        for (int i = 1; i <= 100000; i++) {
            if (!hashSet.contains(i)) return i;
        }
        return 100000;
    }

    public int solution2(int[] A, int M) {
        int[] remain = new int[M];
        for (int j : A) {
            long modM = ((j % M) + M) % M;
            remain[(int)modM]++;
        }
        int ans = 1;
        for(int i : remain){
            ans = Math.max(ans,i);
        }
        return ans;
    }

    /**
     * @Param: [java.lang.String]
     * @return: int
     * @Description: 包含偶数字母出现次数的最长子串长度
     * @Author: Jlutripper
     * @Date: 2022/8/26 21:30
     */
    public int solution(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        int ans = len % 2 == 0 ? len : len - 1;
        while (ans > 0) {
            for (int i = 0; i <= len - ans; i++) {
                int[] alphabet = new int[26];
                for (int j = i; j < i + ans; j++) alphabet[chars[j] - 'a']++;
                if (isEven(alphabet)) return ans;
            }
            ans -= 2;
        }
        return 0;
    }

    boolean isEven(int[] a) {
        int ans = 0;
        for (int i : a) {
            ans |= i;
        }
        return (ans & 1) != 1;
    }


}
