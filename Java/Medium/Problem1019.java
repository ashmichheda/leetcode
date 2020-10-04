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
class Problem1019 {
    public int[] nextLargerNodes(ListNode head) {
        // reversing the linked list and using stack to store the elements
        ListNode current = head;
        ListNode prev = null;
        int length = 0;
        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            length ++;
        }
        head = prev;

        int result[] = new int[length];
        result[length - 1] = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(head.val);
        head = head.next;
        int i = length - 2;

        while(head != null && i >= 0){

            // keep popping stack if current element in array is greater than the current element in stack
            while(!stack.isEmpty() && head.val >= stack.peek())
                stack.pop();

            if(stack.isEmpty())
                result[i] = 0;

            else{
                result[i] = stack.peek();
            }
            stack.push(head.val);
            i--;
            head = head.next;
        }
        return result;
    }
}
