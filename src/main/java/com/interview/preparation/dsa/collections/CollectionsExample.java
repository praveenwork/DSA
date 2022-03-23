package com.interview.preparation.dsa.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Adding elements to the collections
// Sorting a collection
// Searching in a collection
// Copying elements
// Disjoint collections
public class CollectionsExample {

    public static void main(String[] args) {
        //Add All

        List<String> items = new ArrayList<>();
        items.add("shoes");
        items.add("toys");

        Collections.addAll(items, "fruits", "bat", "ball");

        for (String item: items) {
            System.out.println(item);
        }

        // sorting
        Collections.sort(items);
        //Collections.sort(items, Collections.reverseOrder()); //reverse
        for (String item: items) {
            System.out.println(item);
        }
        //searching
        System.out.println(Collections.binarySearch(items, "toys"));
        System.out.println(Collections.binarySearch(items, "abc"));


        //copy
        List<String> destList  = new ArrayList<>();
        destList.add("A");
        destList.add("B");
        destList.add("C");

        System.out.println("===========================");
        for (String item: items) {
            System.out.println(item);
        }

        // disjoint
        System.out.println("Disjoint collections: "+Collections.disjoint(items,destList));


        Collections.copy(items,destList);
        for (String item: items) {
            System.out.println(item);
        }


    }
}
