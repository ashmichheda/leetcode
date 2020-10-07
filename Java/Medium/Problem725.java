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
class Problem725 {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] result = new ListNode[k];
        int size = 0; // size of each bucket
        int leftOver = 0; // no. of buckets needing 1 more element
        int length = 0;
        int index = 0;
        // calculate length of linked list
        ListNode current = root;
        while(current != null){
            current = current.next;
            length++;
        }

        if(length < k)
            size = 1;
        else{
            size = length / k;
            leftOver = length % k;
        }

        // handle for left overs
        current = root;
        while(current != null){

            ListNode temp = current;

            // handle the leftovers
            if(leftOver >= 1){

                for(int i = 0; i<size; i++)
                    current = current.next;
                leftOver--;
            }

            // no more leftovers
            else{
                for(int i = 0; i<size - 1; i++)
                    current = current.next;
            }
            result[index++] = temp;

            // breaking the link
            ListNode next = current.next;
            current.next = null;
            current = next;
        }


        return result;
    }
}
