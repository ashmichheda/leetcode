/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Problem83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        ListNode temp = head;

        while(head.next != null){
            if(head.val == head.next.val)
                head.next = head.next.next;
            else
                head = head.next;
        }
        return temp;
    }
}
