/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Problem144_Iterative {
    List<Integer> result = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        // Iterative Solution
        // Preorder Traversal - Root, left, right
        // Using Stack
        /*
            1. Initially, push the root node into the stack
            2. While stack is not empty
                1. Pop the item from the stack and print it
                2. Push the right child of the popped item
                3. Push the left child of the popped item
        */
       Stack<TreeNode> stack = new Stack<TreeNode>();
       if(root == null)
           return result;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.peek();
            result.add(node.val);
            stack.pop();
            if(node.right != null){
                stack.push(node.right);
            }

            if(node.left != null){
                stack.push(node.left);
            }
        }
        return result;
    }
}
