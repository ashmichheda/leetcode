/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        HashSet<ListNode> hashSet = new HashSet<ListNode>();
        ListNode temp = head;

        if(head == null)
            return null;

        // add nodes to the Array list
        while(temp != null){

            if(hashSet.contains(temp)){
                head = temp;
                return head;
            }
            hashSet.add(temp);
            temp = temp.next;
        }

        return null;
    }
}
