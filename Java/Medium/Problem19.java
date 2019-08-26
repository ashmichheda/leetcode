/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Problem19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        /*
        Creating 2 pointers,
        First pointer --> points to the head of the linked list
        Second pointer --> points to nth node from the beginning of the linked list
        */

        ListNode first = head;
        ListNode second = head;


        for(int i = 0; i<n; i++){

            if(second.next == null){
                if(i == n-1){
                    head = head.next;
                    return head;
                }
            }
             second = second.next;
        }

        // Keep incrementing both the pointers
        // till second pointer reaches the last node
        while(second.next != null){
            first = first.next;
            second = second.next;
        }
        first.next = first.next.next;
        return head;
    }
}
