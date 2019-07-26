/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Problem94 {
    public List<Integer> inorderTraversal(TreeNode root) {

        // Iterative approach
        TreeNode curr = root;
        List<Integer> inorderList = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        while(curr != null || stack.size() > 0){

            while(curr != null){
                // Reach the leftmost node of the curr Node
            stack.push(curr);
            curr = curr.left;
            }


            // pop the node value from stack and store in list
            curr = stack.pop();
            inorderList.add(curr.val);
            curr = curr.right;
      }
    return inorderList;

    // Recursive approach
    List<Integer> inorderList = new ArrayList<Integer>();
    if(root == null)
        return inorderList;
    if(root.left != null)
        inorderTraversal(root.left);
    inorderList.add(root.val);
    if(root.right != null)
        inorderTraversal(root.right);
    return inorderList;
    }
}
