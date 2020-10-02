/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Problem817 {
    public int numComponents(ListNode head, int[] G) {
        if(head == null)
            return 0;

        boolean nodeConnected[] = new boolean[10000];
        for(int num : G)
            nodeConnected[num] = true;

        // find the connected component node from the linkedList
        ListNode current = head;
        while(current != null && !nodeConnected[current.val]){
            current = current.next;
        }

        if(current == null)
            return 0;
        
        int connected = 1;
        while(current != null){
            if(!nodeConnected[current.val]){

                // find the next connected component
                while(current != null && !nodeConnected[current.val])
                    current = current.next;

                // increment the connected count if current not reached the end of list
                if(current != null)
                    connected++;
            }
            else{
                current = current.next;
            }
        }
        return connected;
    }
}
