package com.leetcodeEasy.progs;

public class Problem617 {
    /**
            * Definition for a binary tree node.
            * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if(t1 == null && t2 == null)
            return null;
        if(t1 == null)
            return t2;
        if(t2 == null)
            return t1;

        TreeNode mergedTree = new TreeNode(t1.val + t2.val);
        mergedTree.left = mergeTrees(t1.left, t2.left);
        mergedTree.right = mergeTrees(t1.right, t2.right);
        return mergedTree;
    }
}