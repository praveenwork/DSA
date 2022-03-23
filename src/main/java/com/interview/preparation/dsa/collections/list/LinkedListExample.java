package com.interview.preparation.dsa.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        System.out.println(linkedList);
        linkedList.addFirst(400);
        System.out.println(linkedList);

    }
}
