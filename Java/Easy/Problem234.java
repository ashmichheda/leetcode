/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 /**
  * Definition for singly-linked list.
  * public class ListNode {
  *     int val;
  *     ListNode next;
  *     ListNode(int x) { val = x; }
  * }
  */
 class Problem234 {
     public boolean isPalindrome(ListNode head) {

         int length = length(head);
         int input[] = new int[length];
         boolean result = true;
         if(length == 0)
             return result;

         ListNode temp = head;
         int i = 0;
         while(temp != null){
             input[i] = temp.val;
             i++;
             temp = temp.next;
         }

         // check for palindrome
         i = 0; int j = input.length-1;
         while(i < j){
             if(input[i] == input[j])
                 result = true;
             else{
                 result = false;
                 break;
             }
             i++;
             j--;
         }
         return result;
     }

     public int length(ListNode node){
         int length = 0;
         while(node != null){
             length++;
             node = node.next;
         }
         return length;
     }
 }
