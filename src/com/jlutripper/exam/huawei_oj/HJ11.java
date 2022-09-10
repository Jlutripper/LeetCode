package com.jlutripper.exam.huawei_oj;

import java.util.Scanner;

/**
 * @description: HJ11 数字颠倒
 * @author: Jlutripper
 * @create: 2022-09-11 03:20
 **/


public class HJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.length()==1){
            System.out.println(s);
            return;
        }
        char[] c = s.toCharArray();
        int len = c.length;
        for (int i = 0; i < (len / 2); i++){
            char temp = c[i];
            c[i] = c[len-i-1];
            c[len-i-1] = temp;
        }
        for(Character character : c){
            System.out.print(character);
        }

    }
}
