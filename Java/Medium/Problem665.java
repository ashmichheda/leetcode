/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Problem665 {
    public List<List<String>> printTree(TreeNode root) {
        List<List<String>> result = new ArrayList<>();
        if(root == null)
            return result;
        int rows = getHeight(root);
        int cols = (int) Math.pow(2, rows) - 1;

        // create a blank 2D array and initiaize value with no space
        for(int i = 0; i<rows; i++){
            List<String> row = new ArrayList<>();
            for(int j = 0; j<cols; j++){

                row.add("");
            }
            result.add(row);
        }


        Queue<TreeNode> queue = new LinkedList<>();
        Queue<int []> indexQ = new LinkedList<>();
        queue.offer(root);
        indexQ.offer(new int[] {0, cols - 1});
        int row = -1;
        while(!queue.isEmpty()){

            row++;
            int size = queue.size();
            for(int i = 0; i<size; i++){

                TreeNode current = queue.poll();
                int indices[] = indexQ.poll();
                if(current  == null)
                    continue;
                int left = indices[0];
                int right = indices[1];
                int mid = (left + right) / 2;

                result.get(row).set(mid, String.valueOf(current.val));
                queue.offer(current.left);
                queue.offer(current.right);

                indexQ.offer(new int [] {left, mid - 1});
                indexQ.offer(new int[] {mid+1, right});
            }

        }
        return result;
    }

    private int getHeight(TreeNode root){
        if(root == null)
            return 0;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
}
