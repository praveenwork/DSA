package com.interview.preparation.dsa.collections.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// No duplicate
// sorts
// not thread safe
// not preserve the insert order

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        //Add
        treeSet.add("A");
        treeSet.add("Z");
        treeSet.add("C");

        System.out.println(treeSet);

        // Add duplicate
        treeSet.add("C");
        System.out.println(treeSet);

        // Access element
        System.out.println("Contains:" + treeSet.contains("A"));
        System.out.println("First:" + treeSet.first());
        System.out.println("Poll First:" + treeSet.pollFirst());
        System.out.println("Poll First:" + treeSet.pollLast());
        System.out.println("Poll First:" + treeSet.lower("X"));

        // Remove
        treeSet.remove("C");
        System.out.println(treeSet);

        // Iterate
        Iterator<String> itr = treeSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
