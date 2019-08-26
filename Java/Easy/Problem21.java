package com.leetcodeEasy.progs;

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public class Problem21 {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

            ListNode temp, result;
            temp = new ListNode(0);
            result = temp;
            while(l1 != null && l2 != null){
                if(l1 != null || l2 != null){
                    if(l1.val < l2.val){
                        temp.next = l1;
                        l1 = l1.next;
                    }
                    else{
                        temp.next = l2;
                        l2 = l2.next;
                    }
                }
                temp = temp.next;
            }
            // check for if any one of the list is not empty
            if(l1 != null)
                temp.next = l1;
            else
                temp.next = l2;
            return result.next;
        }
    }
