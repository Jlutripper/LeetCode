package com.jlutripper.exam.huawei_oj;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @description: 明明的随机数
 * @author: Jlutripper
 * @create: 2022-09-03 21:23
 **/


public class hj3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        while(sc.hasNext()) set.add(sc.nextInt());
        set.forEach(System.out::println);
    }
}
