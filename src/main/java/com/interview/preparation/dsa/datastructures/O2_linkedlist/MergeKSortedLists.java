package com.interview.preparation.dsa.datastructures.O2_linkedlist;

import java.util.PriorityQueue;

/**
 *  Leet Code: 23. Merge k Sorted Lists
 *
 *  You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 *
 *  Merge all the linked-lists into one sorted linked-list and return it.
 *
 *  Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * Output: [1,1,2,3,4,4,5,6]
 * Explanation: The linked-lists are:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * merging them into one sorted list:
 * 1->1->2->3->4->4->5->6
 *
 */

class LNode {
     int val;
     LNode next;
     LNode() {}
     LNode(int val) { this.val = val; }
     LNode(int val, LNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append(val).append("->");
         while(next!=null){
             sb.append(next.val);
             next = next.next;
             if(next!=null){
                 sb.append("->");
             }
         }
         return sb.toString();
    }
}
public class MergeKSortedLists {

    public LNode mergeKSortLists(LNode[] listNodes){
        if (listNodes == null || listNodes.length == 0 ) return null;

        PriorityQueue<LNode> priorityQueue = new PriorityQueue<>((l1,l2) -> l1.val - l2.val);

        for(LNode lnode: listNodes){
            if(lnode != null){
                priorityQueue.add(lnode);
            }
        }

        if(priorityQueue.size() == 0) return null;

        LNode head = new LNode(0);
        LNode prev = head;

        while(priorityQueue.size() > 0){
                LNode min = priorityQueue.poll();
                System.out.println(min.val);
                if(min.next != null){
                    priorityQueue.add(min.next);
                }
                prev.next = min;
                prev = min;
        }
        return head.next;
    }
    public static void main(String[] args) {

        LNode lNodeOne = new LNode(1 , new LNode(4, new LNode(5)));
        LNode lNodeTwo = new LNode(1 , new LNode(3, new LNode(4)));
        LNode lNodeThree = new LNode(2 , new LNode(6));
        LNode[] listNodes = {lNodeOne, lNodeTwo, lNodeThree};
        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
        LNode result = mergeKSortedLists.mergeKSortLists(listNodes);
        System.out.println("---result");
        System.out.println(result.toString());

    }
}
