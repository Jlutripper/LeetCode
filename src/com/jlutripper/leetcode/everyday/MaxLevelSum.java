package com.jlutripper.leetcode.everyday;

import com.jlutripper.leetcode.tools.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxLevelSum {
    public int maxLevelSum(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        int level = 1;              //level of cur
        int res = 1;                //level of result
        int count = 1;              //num of this level
        int sum = root.val;         //sum of cur level
        deque.offer(root);
        while(deque.size()!=0){
            int level_count = 0;        //num of next level
            level++;                    //begin next level calculation
            int temp_sum = 0;           //sum of next level
            boolean flag = false;
            for(int i=0;i<count;i++){
                TreeNode temp =  deque.pollFirst();
                if(temp==null) break;
                if(temp.left!=null){
                    flag = true;
                    level_count++;
                    deque.offer(temp.left);
                    temp_sum+= temp.left.val;
                }
                if(temp.right!=null){
                    flag = true;
                    level_count++;
                    deque.offer(temp.right);
                    temp_sum+= temp.right.val;
                }
            }
            if(temp_sum>sum && flag){
                sum = temp_sum;
                res = level;
            }
            count=level_count;
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(-100);
        root.left = new TreeNode(-200);
        root.left.left = new TreeNode(-20);
        root.left.right = new TreeNode(-5);
        root.right = new TreeNode(-300);
        root.right.left = new TreeNode(-10);
        System.out.println(new MaxLevelSum().maxLevelSum(root));
    }
}
