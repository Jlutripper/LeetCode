package com.jlutripper.leetcode.everyday;

import java.util.ArrayList;

/**
 * @description: 1582. 二进制矩阵中的特殊位置
 * @author: Jlutripper
 * @create: 2022-09-04 12:53
 **/


public class NumSpecial {
    public int numSpecial(int[][] mat) {
        int row_len = mat.length;
        int col_len = mat[0].length;
        int ans = 0;
        int[] row = new int[row_len];
        int[] col = new int[col_len];
        ArrayList<int[]> list = new ArrayList<>();

        for(int i = 0;i<row_len;i++){
            for(int j=0;j<col_len;j++){
                row[i]+=mat[i][j];
            }
        }
        for(int i = 0;i<col_len;i++){
            for(int j=0;j<row_len;j++){
                col[i]+=mat[j][i];
                int[] temp = new int[2];
                temp[0] = j;
                temp[1] = i;
                if(mat[j][i]==1) list.add(temp);
            }
        }
        for(int[] loc : list){
            if(row[loc[0]]==1 && col[loc[1]]==1) ans++;
        }
        return ans;
    }
}
