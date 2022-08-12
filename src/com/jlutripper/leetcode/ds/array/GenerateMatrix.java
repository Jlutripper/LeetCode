package com.jlutripper.leetcode.ds.array;

public class GenerateMatrix {
    public int[][] generateMatrix(int n) {
        int x,y; //start_point
        int round = 0;
        int size = n;
        int now = 1;
        int[][] ans = new int[n][n];
        boolean flag = false;
        while(size>=2){
            if(size==2) flag = true;
            int i;
            x = round;
            y = round;
            for(i=0;i<size-1;i++){
                ans[x][y++] = now;
                now++;
            }
            for(i=0;i<size-1;i++){
                ans[x++][y] = now;
                now++;
            }
            for(i=0;i<size-1;i++){
                ans[x][y--] = now;
                now++;
            }
            for(i=0;i<size-1;i++){
                ans[x--][y] = now;
                now++;
            }
            size -=     2;
            round++;
        }
        if(!flag){//size=2->size=1
            ans[round][round]=n*n;

        }
        return ans;
    }
}
