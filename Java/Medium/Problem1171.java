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
class Problem1171 {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        dummy.next = head;
        HashMap<Integer, ListNode> map = new HashMap();
        int sum = 0, key = 0;

        while(curr != null){
            sum += curr.val;
            if(map.containsKey(sum)){
                curr = map.get(sum).next;

                key = sum + curr.val;

                while(key != sum){
                    map.remove(key);
                    curr = curr.next;
                    key += curr.val;
                }
                map.get(sum).next = curr.next;
            }
            else{
                map.put(sum, curr);
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}
