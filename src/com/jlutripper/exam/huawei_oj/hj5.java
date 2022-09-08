package com.jlutripper.exam.huawei_oj;

import java.util.Scanner;

/**
 * @description: 进制转换
 * @author: Jlutripper
 * @create: 2022-09-03 22:27
 **/


public class hj5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            System.out.println(Integer.parseInt(s.substring(2,s.length()),16));
        }
    }
}
