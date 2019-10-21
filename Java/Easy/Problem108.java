/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Problem108 {
    public TreeNode sortedArrayToBST(int[] nums) {

        return createBSTRecursive(nums, 0, nums.length-1);
    }
    public TreeNode createBSTRecursive(int nums[], int left, int right){
        if(nums.length == 0 || nums == null || left > right)
            return null;

        int mid = (left + right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createBSTRecursive(nums, left, mid-1);
        root.right = createBSTRecursive(nums, mid+1, right);
        return root;
    }
}
