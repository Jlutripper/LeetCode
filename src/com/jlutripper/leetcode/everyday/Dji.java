package com.jlutripper.leetcode.everyday;

import java.util.Scanner;

public class Dji {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = s.substring(1,s.length()-1);
        String[] nums = s1.split(",");
        int[] num = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            num[i] = Integer.parseInt(nums[i]);
        }

        int sum = 0;
        for(int i=0;i<nums.length-2;i++){
            if(num[i]>num[i+1]+num[i+2]){
                sum+=num[i];
                i+=2;
            }
        }
    }
}
