package com.jlutripper.leetcode.traceback;

import java.util.ArrayList;
import java.util.List;

public class CombineSum {
    public List<List<Integer>> ans;
    public List<Integer> tmp;
    public List<List<Integer>> combinationSum3(int k, int n) {
        if(n<3 || n>45) return new ArrayList<>();
        ans = new ArrayList<>();
        tmp = new ArrayList<>();
        traceback(k,n,1,0);
        return ans;
    }

    public void traceback(int k, int n, int loc, int sum){
        if(tmp.size()==k){
            if(sum==n){
                ans.add(new ArrayList<>(tmp));
            }
            return;
        }
        for(int i=loc;i<=9;i++){
            sum += loc;
            if(sum>n) return;
            tmp.add(loc);
            traceback(k,n,i+1,sum);
        }
        if(!tmp.isEmpty()){
            tmp.remove(tmp.size()-1);
        }

    }
}
