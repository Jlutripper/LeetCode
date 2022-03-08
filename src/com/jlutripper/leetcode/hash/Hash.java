package com.jlutripper.leetcode.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hash{
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;

        Map<Character, Integer> table = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            table.put(ch,table.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            table.put(ch,table.getOrDefault(ch,0)-1);
            if(table.get(ch)<0) return false;
        }
        return true;
    }

    public void  isHappy(){
        Set set = new HashSet();
        Object a = new Object();
        set.contains(a);
    }
}
