/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Problem429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int size = 1;
        while(!queue.isEmpty()){
            int newSize = 0;
            List<Integer> tempList = new ArrayList<>();
            for(int i = 0; i < size; i++){
                Node node = queue.poll();
                tempList.add(node.val);
                for(Node child : node.children){
                    queue.offer(child);
                    newSize++;
                }
            }
            if(tempList.size() != 0)
                result.add(tempList);
            size = newSize;
        }
        return result;
    }
}
