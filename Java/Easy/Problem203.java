package com.leetcodeEasy.progs;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {

       // Using list to store all non-matching values from Linked List
        List<ListNode> listOfNodes = new ArrayList<ListNode>();
        ListNode current = head;

        if(current == null)
            return head;

        while(current != null){
            if(current.val != val)
                listOfNodes.add(current);
            current = current.next;
        }

        int length = listOfNodes.size();
        System.out.println(length);
        // if length == 0, means there are all matching elements with val
        // hence return null
        if(length == 0)
            return null;
        else{
            // connect the nodes from the list
            for(int i = 0; i<length-1; i++){
                listOfNodes.get(i).next = listOfNodes.get(i+1);
            }
            listOfNodes.get(length-1).next = null;
            head = listOfNodes.get(0);
            return head;
        }

    }
}
