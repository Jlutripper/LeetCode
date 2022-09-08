package com.jlutripper.leetcode.tools;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PrimitiveIterator;
import java.util.Set;

/**
 * @ClassName: Test
 * @Description:
 * @Auther: Jlutripper
 * @Date: 2022/8/16 16:52
 */

public class Test {
    static class test{
        public int a;

        public test(int a) {
            this.a = a;
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public boolean equals(Object obj) {
            return false;
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++) System.out.println(a[i]);
        for(int i : a) System.out.println(a);

    }
}


