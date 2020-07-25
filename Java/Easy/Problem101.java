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
class Problem101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        boolean isSymmetric = checkSymmetry(root.left, root.right);
        return isSymmetric;
    }
    public boolean checkSymmetry(TreeNode leftSubtree, TreeNode rightSubtree){
        if(leftSubtree == null && rightSubtree == null)
            return true;
        else if(leftSubtree != null && rightSubtree != null){
            return ((leftSubtree.val == rightSubtree.val) &&
                    (checkSymmetry(leftSubtree.left, rightSubtree.right) &&
                    (checkSymmetry(leftSubtree.right, rightSubtree.left))));
        }
        else
            return false;
    }
}
