package com.jlutripper.exam.huawei_oj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: 计算某字符出现次数
 * @author: Jlutripper
 * @create: 2022-09-03 21:09
 **/


public class hj2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = new String[2];
        String temp;
        try {
            int i = 0;
            while ((temp = br.readLine()) != null) {
                a[i] = temp;
                i++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        String line = a[0].toLowerCase();
        String target = a[1].toLowerCase();
        Map<Character, Integer> map = new HashMap();
        for(Character c : line.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map.getOrDefault(target.toCharArray()[0],0));
    }
}
