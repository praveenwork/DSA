package com.interview.preparation.dsa.collections.set;

import java.util.HashSet;
import java.util.Iterator;

// Set not allow Duplicates
//Hashset does not support ordering
public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> cricketerSet = new HashSet<>();

        //Adding
        cricketerSet.add("India");
        cricketerSet.add("Australia");
        cricketerSet.add("South Africa");

        System.out.println(cricketerSet);

        // remove
        cricketerSet.remove("Australia");
        System.out.println(cricketerSet);

        //Iterate
       Iterator<String>  itr = cricketerSet.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }

    }
}
