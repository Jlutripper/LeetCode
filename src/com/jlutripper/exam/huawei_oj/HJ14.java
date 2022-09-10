package com.jlutripper.exam.huawei_oj;

import java.util.*;

/**
 * @description: HJ14 字符串排序
 * @author: Jlutripper
 * @create: 2022-09-11 03:34
 **/


public class HJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(sc.nextLine());
//        list.sort((o1, o2) -> {
//            int i = 0;
//            while (i < o1.length() && i < o2.length()) {
//                if (o1.charAt(i) == o2.charAt(i)) i++;
//                else break;
//            }
//            if (i == o1.length()) return -1;
//            if (i == o2.length()) return 1;
//            System.out.println(o1+","+o2+","+i);
//            return o1.charAt(i) - o2.charAt(i);
//        });
//        for (String s : list) System.out.println(s);
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
