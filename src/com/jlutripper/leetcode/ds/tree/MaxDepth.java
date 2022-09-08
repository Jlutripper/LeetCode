package com.jlutripper.leetcode.ds.tree;

import com.jlutripper.leetcode.tools.TreeNode;

/**
 * @description: 剑指 Offer 55 - I. 二叉树的深度
 * @author: Jlutripper
 * @create: 2022-09-02 20:02
 **/


public class MaxDepth {
    private int depth;

    public int maxDepth(TreeNode root) {
        this.depth = 0;
        if (root == null) return 0;
        depth++;
        dfs(root, 1);
        return this.depth;
    }

    public void dfs(TreeNode cur, int depth) {
        if (cur == null) return;
        System.out.println("visit[" + cur.val + "] depth[" + depth + "]");
        this.depth = Math.max(depth, this.depth);
        dfs(cur.left, depth + 1);
        dfs(cur.right, depth + 1);
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode().buildTree(new int[]{3, 0, 20, 0, 0, 15, 7});
        int a =new MaxDepth().maxDepth(head);
        System.out.println(a);
    }
}
