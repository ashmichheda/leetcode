/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Problem1290 {
    public int getDecimalValue(ListNode head) {
        int decimal = 0;
        while(head != null){
            decimal = decimal*2 + head.val;
            head = head.next;
        }
        return decimal;
    }
}
