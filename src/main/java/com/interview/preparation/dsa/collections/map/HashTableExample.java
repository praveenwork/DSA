package com.interview.preparation.dsa.collections.map;

import java.util.Hashtable;
import java.util.Map;

// Key-value pair
// Thread safe
// nulls not allowed for both key and value
// load Factor 0.75
// provide enumeration
// doesn't preserve the order

public class HashTableExample {
    public static void main(String[] args) {
        Map<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("A", 100);
        hashtable.put("B", 100);
        hashtable.put("C", 100);
        hashtable.put("D", 100);

        //Null not allowed
        //hashtable.put(null, 100);
        //hashtable.put("E", null);

        //changeing value
        hashtable.put("D", 200);

        //containskey
        System.out.println("Contains A:"+ hashtable.containsKey("A"));

        //removing
        hashtable.remove("A");

        for (Map.Entry<String,Integer> mapEntry: hashtable.entrySet()) {
            System.out.println(mapEntry.getKey() + " - "+ mapEntry.getValue());
        }
    }
}
