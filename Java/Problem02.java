/*package com.prog.LeetCodeProgs;
*//**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *//*
public class Problem02 {

	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // initializing carry to 0
        int carryNumber = 0;
        ListNode emptyNode = new ListNode(0);
        ListNode currentNode = new ListNode(0);
        ListNode result = currentNode;
        while (emptyNode != l1 || emptyNode != l2) {
            int sum = l1.val + l2.val + carryNumber;
            carryNumber = sum / 10;
            currentNode = (currentNode.next = new ListNode(sum %= 10));
            l1 = null != l1.next ? l1.next : emptyNode;
            l2 = null != l2.next ? l2.next : emptyNode;
        }
        if (carryNumber == 1)
            currentNode.next = new ListNode(carryNumber);
        return result.next;
    }
}
*/