/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Problem876 {
    public ListNode middleNode(ListNode head) {

        // Add all the nodes in the list
        List<ListNode> list = new ArrayList<ListNode>();
        ListNode current = head;

        while(current != null){
            list.add(current);
            current = current.next;
        }
        int n = list.size();

        int result = 0;
        if(n % 2 == 0)
            result = (n/2) + 1;
        else
            result = (n/2) + 1;

        return list.get(result-1);
    }
}
