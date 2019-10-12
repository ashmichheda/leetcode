/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        List<ListNode> result = new ArrayList<>();

        // adding nodes to the list
        ListNode temp = head;
        while(temp != null){
            result.add(temp);
            temp = temp.next;
        }
        int size = result.size();

        if(size%2 == 1)
            result.get(size/2).next = null;
        // reodering nodes
        for(int i = 0; i<size/2; i++){

            int nextIndex = i+1;
            int lastIndex = size - 1 - i;
            result.get(i).next = result.get(lastIndex);

            if(nextIndex == lastIndex)
                result.get(lastIndex).next = null;
            else
                result.get(lastIndex).next = result.get(nextIndex);
        }

    }
}
