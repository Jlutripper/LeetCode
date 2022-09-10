package com.jlutripper.exam.huawei_oj;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @description: HJ8 合并表记录
 * @author: Jlutripper
 * @create: 2022-09-11 03:07
 **/


public class HJ8 {
    /**
     * @Param: []
     * @return: void
     * @Description:
     * @Author: Jlutripper
     * @Date: 2022/9/11 3:08
     */
    public static void solution1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            int v = sc.nextInt();
            treeMap.put(k, treeMap.getOrDefault(k, 0) + v);
        }
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        solution1();
    }
}
