package com.jlutripper.exam.huawei_oj;

import java.util.Scanner;

/**
 * @description: HJ15 求int型正整数在内存中存储时1的个数
 * @author: Jlutripper
 * @create: 2022-09-11 04:01
 **/


public class Hj15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toBinaryString(n);
        int ans = 0;
        for (Character c : s.toCharArray()) if (c == '1') ans++;
        System.out.println(ans);
    }
}
