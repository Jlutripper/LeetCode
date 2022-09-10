package com.jlutripper.exam.huawei_oj;

import java.util.Scanner;

/**
 * @description: HJ13 句子逆序
 * @author: Jlutripper
 * @create: 2022-09-11 03:30
 **/


public class HJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        if(s.length==1) System.out.println(s[0]);
        else {
            for(int i=0;i<s.length/2;i++){
                String temp = s[i];
                s[i] = s[s.length-i-1];
                s[s.length-i-1] = temp;
            }
        }
        for(String s1 : s) System.out.print(s1 + " ");
    }
}
