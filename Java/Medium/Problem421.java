// implementing using Trie/Tree
class TreeNode{
    TreeNode left;
    TreeNode right;
}

class Problem421 {

    public int findMaximumXOR(int[] nums) {

        TreeNode treeNode = new TreeNode();
        insertValues(treeNode, nums);

        return findMaxXOR(treeNode, nums);
    }

    public void insertValues(TreeNode root, int[] nums){
        TreeNode current;

        for(int i = 0; i<nums.length; i++){
            current = root;

            for(int j = 31; j>=0; j--){
                // find the most significant bit OR left most bit
                int bit = (nums[i] >> j) & 1;

                if(bit == 0){
                    if(current.left == null)
                        current.left = new TreeNode();
                    current = current.left;
                }
                else{
                    if(current.right == null)
                        current.right = new TreeNode();
                    current = current.right;
                }
            }
        }
    }

    public int findMaxXOR(TreeNode head, int [] nums){
        int currentXor = 0, maxXor = Integer.MIN_VALUE;
        TreeNode current;
        for(int i = 0; i<nums.length; i++){

            current = head;
            currentXor = 0;

            for(int j = 31; j>=0; j--){
                int bit = (nums[i] >> j) & 1;

                if(bit == 0){
                    if(current.right != null){
                        currentXor += Math.pow(2, j);
                        current = current.right;
                    }
                    else
                        current = current.left;
                }
                else{
                    if(current.left != null){
                        currentXor += Math.pow(2, j);
                        current = current.left;
                    }
                    else
                        current = current.right;
                }
            }
            if(currentXor > maxXor)
                maxXor = currentXor;
        }
        return maxXor;
    }
}
