package com.jlutripper.exam.huawei_oj;

import java.util.*;

/**
 * @description: 字符串分隔
 * @author: Jlutripper
 * @create: 2022-09-03 22:08
 **/


public class hj4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();
        int times = chars.length / 8;
        int left = chars.length % 8;
        for (int i = 0; i < times; i++) {
            StringBuffer sb = new StringBuffer();
            sb.append(chars, i * 8, 8);
            System.out.println(sb);
        }
        if (left != 0) {
            StringBuffer sb1 = new StringBuffer();
            for (int j = 8 * times; j < chars.length; j++) {
                sb1.append(chars[j]);
            }
            int len = sb1.length();
            for (int i = 0; i < 8 - len; i++) {
                sb1.append(0);
            }
            System.out.println(sb1);
        }
    }
}
