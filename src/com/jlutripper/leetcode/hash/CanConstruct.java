package com.jlutripper.leetcode.hash;
import java.util.*;
public class CanConstruct {
    public boolean canConstruct(String a, String b){
        char[] tmp1 = a.toCharArray();
        char[] tmp2 = a.toCharArray();
        Map<Character, Integer> map = new HashMap();
        for(char character:tmp1){
            if(map.containsKey(character)){
                map.put(character,map.get(character)+1);
            }
            else map.put(character,1);
        }
        for(char cha:tmp2){
            if(map.containsKey(cha)){
                if(map.get(cha)==0) return false;
                map.put(cha,map.get(cha)-1);
            }
            else return false;
        }
        return true;
    }

    public boolean canIntConstruct(String a, String b){
        int[] ans = new int[26];
        char[] tmp1 = a.toCharArray();
        char[] tmp2 = a.toCharArray();
        int count =0;
        for(char c1:tmp1){
        }
        return true;
    }

}
