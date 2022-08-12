package com.jlutripper.leetcode.ds.string;

import java.util.ArrayList;
import java.util.List;

public class ReverseStr {
    public void reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        List<Character> tmp = new ArrayList<>();
        for(char i : a){
            tmp.add(i);
        }
        int loc = 0;
        while(loc + 2*k < a.length){
        }
    }
}
