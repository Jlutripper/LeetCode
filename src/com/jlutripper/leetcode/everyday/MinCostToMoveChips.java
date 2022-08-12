package com.jlutripper.leetcode.everyday;

public class MinCostToMoveChips  {
    public int minCostToMoveChips(int[] position) {
        int count = 0;
        for (int j : position) {
            if (j % 2 == 1) count++;
        }
        int els = position.length-count;
        return Math.min(count, els);
    }
}
