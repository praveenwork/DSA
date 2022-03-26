package com.interview.preparation.dsa.datastructures.O2_linkedlist;

class
ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class LinkedListReverse {

    private boolean stop;
    private ListNode head;
    private ListNode leftNode;

    public void recursiveAndReverse(ListNode rightNode, int m , int n){
        if(n == 1){
            return;
        }

        rightNode = rightNode.next;

        if(m > 1){
            this.leftNode = this.leftNode.next;
        }
        this.recursiveAndReverse(rightNode, m-1, n-1);

        if(this.leftNode == rightNode || rightNode.next == this.leftNode){
            this.stop = true;
        }

        if(!this.stop){
            int tempVal = this.leftNode.val;
            this.leftNode.val = rightNode.val;
            rightNode.val = tempVal;
            this.leftNode = this.leftNode.next;
        }

    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        this.leftNode = head;
        this.stop = false;
        this.recursiveAndReverse(head, left, right);
        return head;
    }

    private void insert(int value){
        if( head == null){
            head = new ListNode(value);
            return;
        }

        ListNode node = head;
        while(node.next!=null){
            node = node.next;
        }
        node.next = new ListNode(value);
    }

    private void display(){
        ListNode header = head;
        while(header != null){
            System.out.print(header.val+ "  ");
            header = header.next;
        }
    }
    public static void main(String[] args) {
        LinkedListReverse linkedListReverse = new LinkedListReverse();
        linkedListReverse.insert(1);
        linkedListReverse.insert(2);
        linkedListReverse.insert(3);
        linkedListReverse.insert(4);
        linkedListReverse.insert(5);
        linkedListReverse.display();
        linkedListReverse.reverseBetween(linkedListReverse.head, 2,4);
        System.out.println("");
        linkedListReverse.display();
    }
}
