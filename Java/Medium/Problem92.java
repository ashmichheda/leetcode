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
class Problem92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null)
            return null;

        ListNode prev = null;
        ListNode currNode = head;

        // iterate the list will m to get the starting node to reverse
        while(m > 1){
            prev = currNode;
            currNode = currNode.next;
            m--;
            n--;
        }

        // initialize connection nodes
        ListNode connection = prev;
        ListNode tail = currNode;

        // reverse the linkedlist from the start point
        while(n > 0){
            ListNode nextNode = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = nextNode;
            n--;
        }

        if(connection != null){
            connection.next = prev;
        }
        else{
            head = prev;
        }
        tail.next = currNode;

        return head;
    }
}
