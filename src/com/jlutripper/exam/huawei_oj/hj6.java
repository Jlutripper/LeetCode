package com.jlutripper.exam.huawei_oj;

import java.util.Scanner;

/**
 * @description: 质数因子
 * @author: Jlutripper
 * @create: 2022-09-04 13:48
 **/


public class hj6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<(int)Math.sqrt(n);i++){
            while(n % i ==0){
                System.out.println(i + " ");
                n = n / i;
            }
        }
        System.out.println(n == 1 ? "": n+" ");
    }
}
