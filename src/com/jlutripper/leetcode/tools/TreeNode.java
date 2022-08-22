package com.jlutripper.leetcode.tools;


import java.util.ArrayDeque;
import java.util.Deque;

//Definition for a binary tree node.
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode buildTree(int[] a) {
        return buildTreeByArr(a,0);
    }

    private TreeNode buildTreeByArr(int[] a, int i){
        if(i>=a.length) return null;
        TreeNode root = new TreeNode(a[i]);
        root.left = buildTreeByArr(a,2*i+1);
        root.right = buildTreeByArr(a,2*i+2);

        return root;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        TreeNode head = new TreeNode().buildTree(a);
    }
}
