package com.interview.preparation.dsa.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

// Preserve the insertion order
// no duplicates

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        //Adding
        linkedHashSet.add("D");
        linkedHashSet.add("A");
        linkedHashSet.add("C");
        linkedHashSet.add("B");

        System.out.println(linkedHashSet);
        linkedHashSet.add("A");
        System.out.println(linkedHashSet);

        //Removing
        linkedHashSet.remove("A");
        System.out.println(linkedHashSet);

        Iterator<String> itr = linkedHashSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
