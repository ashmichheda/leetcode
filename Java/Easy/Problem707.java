package com.leetcodeEasy.progs;

public class Problem707 {

    class Node{
            int val;
            Node next;

            public Node(int val){
                this.val = val;
                next = null;
            }
        }

        private Node head;
        private int size;
        /** Initialize your data structure here. */
        public Problem707() {
            head = null;
        }

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {

            if(index < 0 || index >= size)
                return -1;
            if(index == 0)
                return head.val;

            Node curr = head;

            for(int i = 0; i<index; i++){
                curr = curr.next;
            }

            return curr.val;
        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {

            if(head == null){
                size++;
                Node newNode = new Node(val);
                head = newNode;
            }
            else{
                size++;
                Node newNode = new Node(val);
                newNode.next = head;
                head = newNode;
            }

        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {

            if(head == null){
                Node lastNode = new Node(val);
                head = lastNode;
            }
            size++;
            Node lastNode = new Node(val);
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = lastNode;
        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {

            if(index > size)
                return;
            if(index <= 0){
                Node node = new Node(val);
                node.next = head;
                head = node;
                size++;
            }
            else{
                size++;
                Node curr = head;
                for(int i = 0; i<index-1; i++){
                    curr = curr.next;
                }
                Node node = new Node(val);
                node.next = curr.next;
                curr.next = node;
            }
        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) return;


            if (index == 0 && size == 1) {
                head = null;
            }
            else if(index == 0 && size > 1)
                head = head.next;
            else{
                Node curr = head;
                for (int i = 0; i < index - 1; i++) {
                    curr = curr.next;
                }
                curr.next = curr.next.next;
            }
            size--;
        }

        void printLinkedList(){
            System.out.println("Size is: "+size);
            Node temp = head;
            while(temp != null){
                System.out.print(" "+temp.val+" ");
                temp = temp.next;
            }
        }

    public static void main(String[] args) {
        Problem707 p = new Problem707();
        p.addAtHead(1);
        p.addAtTail(3);
        p.addAtIndex(1, 2);
        p.printLinkedList();
        System.out.println(p.get(1));
        p.deleteAtIndex(0);
        p.printLinkedList();
        System.out.println(p.get(0));
    }
}
