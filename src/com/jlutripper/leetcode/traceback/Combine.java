package com.jlutripper.leetcode.traceback;

import java.util.ArrayList;
import java.util.List;

public class Combine {
    private int[] array;
    private int len;
    public List<List<Integer>> ans;
    public List<Integer> tmp;

    public List<Integer> combine2(int[] a){
        ans = new ArrayList<>();
        tmp = new ArrayList<>();
        this.array = a;
        len = this.array.length;
        traceback2(0);


        return tmp;
    }

    public void traceback2(int loc){
        if(tmp.size()==3){
            ans.add(new ArrayList<>(tmp));
            return;
        }
        for(int i=loc;i<len;i++){
            tmp.add(array[i]);
            traceback2(i+1);
            if(!tmp.isEmpty()){
                tmp.remove(tmp.size()-1);
            }
        }
    }
/*******************************************************************************/

    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        tmp = new ArrayList<>();
        trackback(n,k,1);
        return ans;
    }

    public void trackback(int n, int k, int loc) {
        if (tmp.size() == k) {
            ans.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = loc; i <= n; i++) {
            tmp.add(i);
            trackback(n,k,i+1);
            if(!tmp.isEmpty()){
                tmp.remove(tmp.size()-1);
            }
        }
    }
}
