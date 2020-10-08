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
class Problem148 {
    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        // perform merge sort.
        // keep dividing the list in halfs and then merge them back in nlogn time
        // split the list in half
        ListNode slow = head, fast = head;
        ListNode temp = head;

        while(fast != null && fast.next != null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = null;
        ListNode leftHalf = sortList(head);
        ListNode rightHalf = sortList(slow);

        return merge(leftHalf, rightHalf);
    }

    private ListNode merge(ListNode l1, ListNode l2){

        ListNode sortedTemp = new ListNode(0);
        ListNode currentNode = sortedTemp;
        while(l1 != null && l2 != null){
            if(l1.val <  l2.val){
                currentNode.next = l1;
                l1 = l1.next;
            }
            else{
                currentNode.next = l2;
                l2 = l2.next;
            }

            currentNode = currentNode.next;
        }
            if(l1 != null){
                currentNode.next = l1;
            }
            if(l2 != null){
                currentNode.next = l2;
            }

        return sortedTemp.next;
    }
}
