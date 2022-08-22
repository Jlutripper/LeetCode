package com.jlutripper.leetcode.everyday;

import com.jlutripper.leetcode.tools.TreeNode;

/**
 * @ClassName: DeepestLeavesSum
 * @Description: 1302. 层数最深叶子节点的和
 * @Auther: Jlutripper
 * @Date: 2022/8/17 09:19
 */

public class DeepestLeavesSum {

    private int maxLevel = 1;
    private int ans = 0;
    private int level = 1;

    public int deepestLeavesSum(TreeNode root) {
        ans += root.val;
        deepTraversal(root,0);
        return ans;
    }

    public void deepTraversal(TreeNode node, int level) {
        if(node==null) return;
        level++;
        if (level == maxLevel) ans += node.val;
        else if (level > maxLevel) {
           ans = node.val;
           maxLevel = level;
        }
        deepTraversal(node.left,level);
        deepTraversal(node.right,level);
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        TreeNode head = new TreeNode().buildTree(a);
        System.out.println(new DeepestLeavesSum().deepestLeavesSum(head));
    }
}


