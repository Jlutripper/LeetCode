package com.jlutripper;


import com.jlutripper.leetcode.linkedlist.MyLinkedList;

import java.util.Arrays;
import java.util.Scanner;

public class Main { // 注意类名必须为Main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int i = 0;

            String[] nums = scan.nextLine().split(" ");
            int sum = 0;
            for(String num_s: nums){
                sum += Integer.parseInt(num_s);
                i |= Integer.parseInt(num_s);
            }
            if(i==0) return;
            System.out.println(sum);
        }
    }
}
