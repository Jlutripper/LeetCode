package com.jlutripper.exam.huawei_oj;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @description: HJ10 字符个数统计
 * @author: Jlutripper
 * @create: 2022-09-11 03:18
 **/


public class HJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> hashSet = new HashSet<>();
        String s = sc.nextLine();
        for(Character c : s.toCharArray())
            hashSet.add(c);
        System.out.println(hashSet.size());
    }
}
