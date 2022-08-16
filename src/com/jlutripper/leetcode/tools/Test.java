package com.jlutripper.leetcode.tools;

import java.util.Arrays;

/**
 * @ClassName: Test
 * @Description:
 * @Auther: Jlutripper
 * @Date: 2022/8/16 16:52
 */

public class Test {
    private final int[] a;

    public Test(int[] a) {
        this.a = a;
    }

    public void test(){
        for(int i=0;i<a.length;i++){
            a[i]+=1;
        }
    }


    public static void main(String[] args) {
        int[] a = {1,2,3};
        new Test(a).test();
        System.out.println(Arrays.toString(a));
    }
}


