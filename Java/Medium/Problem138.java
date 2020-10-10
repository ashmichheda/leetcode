/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Problem138 {
    public Node copyRandomList(Node head) {

        if(head == null)
            return head;

        // using hashmap to store the clone of each node of the linked list
        Map<Node, Node> cloneMap = new HashMap<>();

        Node current = head;
        while(current != null){
            cloneMap.put(current, new Node(current.val));
            current = current.next;
        }
        // reeset curr to head
        current = head;
        while(current != null){
            cloneMap.get(current).next = cloneMap.get(current.next);
            cloneMap.get(current).random = cloneMap.get(current.random);
            current = current.next;
        }
        return cloneMap.get(head);
    }
}
