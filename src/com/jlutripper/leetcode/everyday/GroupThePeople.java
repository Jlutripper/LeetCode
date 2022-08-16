package com.jlutripper.leetcode.everyday;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupThePeople {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ret = new ArrayList<>();
        Map<Integer,List<Integer>> map = new HashMap<>();
         for(int i=0;i<groupSizes.length;i++){
             if(map.size()==0 || !map.containsKey(groupSizes[i])){
                 List<Integer> temp = new ArrayList<>();
                 temp.add(i);
                 if(groupSizes[i]==1){
                     ret.add(temp);
                 }
                 else map.put(groupSizes[i],temp);
             }
             else {
                 List<Integer> temp = map.get(groupSizes[i]);
                 temp.add(i);
                 if (temp.size()==groupSizes[i]){
                     ret.add(temp);
                     map.remove(groupSizes[i]);
                 }
             }
         }
         return ret;
    }
}
