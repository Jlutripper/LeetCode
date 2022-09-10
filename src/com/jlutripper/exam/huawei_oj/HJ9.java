package com.jlutripper.exam.huawei_oj;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @description: HJ9 提取不重复的整数
 * @author: Jlutripper
 * @create: 2022-09-11 03:14
 **/


public class HJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        LinkedHashSet<Character> treeSet = new LinkedHashSet<>();
        sb.reverse();
        for(int i=0;i<sb.length();i++){
            treeSet.add(sb.charAt(i));
        }
        for(Character c : treeSet){
            System.out.print(c);
        }
    }
}
