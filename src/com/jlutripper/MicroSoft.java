package com.jlutripper;

import java.util.ArrayList;
import java.util.List;

public class MicroSoft {
    List test(int[] a, int[] b){
        int len_a = a.length;
        int len_b = b.length;

        int[] big;
        int[] small;

        List ans = new ArrayList();

        int big_len;
        int small_len;

        if(len_a>len_b){
            big_len = len_a;
            small_len = len_b;
            big = a;
            small = b;
        }
        else{
            big_len = len_b;
            small_len = len_a;
            big = b;
            small = a;
        }


        for(int i = small_len-1;i>=0;i--){

            List tmp = new ArrayList();
            int more = 0;
            for(int j = big_len-1; j>=0; j--){
                int sum = small[i] * big[j] + more;
                int l = sum % 10;     //个位
                tmp.add(l);
                more = sum / 10;     //十位
            }
            if(more>0) tmp.add(more);
        }

        return ans;
    }
}
