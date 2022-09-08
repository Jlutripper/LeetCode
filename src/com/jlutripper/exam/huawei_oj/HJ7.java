package com.jlutripper.exam.huawei_oj;

import java.util.Scanner;

/**
 * @description: 取近似值
 * @author: Jlutripper
 * @create: 2022-09-04 13:59
 **/

//import java.util.*;
//
//public class Main {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//    }
//}

public class HJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double d = sc.nextDouble();
        String[] num = d.toString().split("\\.");
        if(num[1].charAt(0)-'5'>=0) System.out.println(Integer.parseInt(num[0])+1);
        else System.out.println(Integer.parseInt(num[0]));
    }
}
