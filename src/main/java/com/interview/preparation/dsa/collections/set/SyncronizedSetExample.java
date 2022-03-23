package com.interview.preparation.dsa.collections.set;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class SyncronizedSetExample {

    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("Z");
        treeSet.add("B");
        treeSet.add("X");

        System.out.println(treeSet);
        // convert to synchronized Treeset
        Set<String> syncronizedTreeSet = Collections.synchronizedSet(treeSet);
        System.out.println(syncronizedTreeSet);
    }
}
