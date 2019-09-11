package com.leetcodeEasy.progs;

class Problem961 {
    public ListNode middleNode(ListNode head) {

      // Store Unique elements in Hashset
       Set<Integer> hash = new HashSet<Integer>();

       for(int i = 0; i<A.length; i++){
           if(!hash.add(A[i]))
               return A[i];
       }
       return -1;
    }
}
