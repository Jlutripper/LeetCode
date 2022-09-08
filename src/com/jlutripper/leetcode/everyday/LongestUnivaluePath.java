package com.jlutripper.leetcode.everyday;

import com.jlutripper.leetcode.tools.TreeNode;

/**
 * @description: 687. 最长同值路径
 * @author: Jlutripper
 * @create: 2022-09-02 18:40
 **/


public class LongestUnivaluePath {
    /**
     * @Param: [com.jlutripper.leetcode.tools.TreeNode]
     * @return: int
     * @Description: 给定一个二叉树的 root ，返回 最长的路径的长度 ，这个路径中的 每个节点具有相同值 。 这条路径可以经过也可以不经过根节点。
     * @Author: Jlutripper
     * @Date: 2022/9/2 18:58
     */

    private int res;

    public int longestUnivaluePath(TreeNode root) {
        this.res = 0;
        if(root==null) return res;
        dfs(root);
        return res;
    }

    public int  dfs(TreeNode root){
        if(root==null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        int left1 = 0, right1 = 0;
        if (root.left != null && root.left.val == root.val) {
            left1 = left + 1;
        }
        if (root.right != null && root.right.val == root.val) {
            right1 = right + 1;
        }
        res = Math.max(res, left1 + right1);
        return Math.max(left1, right1);
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode().buildTree(new int[] {1,1,1,2,3,4,5});
        new LongestUnivaluePath().longestUnivaluePath(head);
    }
}
