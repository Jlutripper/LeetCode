package com.jlutripper.exam.huawei_oj;

import java.util.Scanner;

/**
 * @description: 字符串最后一个单词的长度
 * @author: Jlutripper
 * @create: 2022-09-03 20:37
 **/


public class hj1 {
    /**
     * @Param: [java.lang.String[]]
     * @return: void
     * @Description: 计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。（注：字符串末尾不以空格为结尾）
     * @Author: Jlutripper
     * @Date: 2022/9/3 20:38
     */
    public  static void  main(String [] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        System.out.println(s[s.length-1].length());
        StringBuffer sb = new StringBuffer();
    }
}
