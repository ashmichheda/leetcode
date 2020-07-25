/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Problem70 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;
        // do a pre-order traversal, left node, right node, root
        swapNode(root);
        return root;
    }
    public void swapNode(TreeNode root){

        if(root == null)
            return;

        swapNode(root.left);
        swapNode(root.right);

        // swap the nodes
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
