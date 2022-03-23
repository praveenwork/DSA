package com.interview.preparation.dsa.collections.map;

import java.util.HashMap;
import java.util.Map;

// key-value pair
// allows null as key as well as values
// based on hash techniques.
// not allow duplicate Keys
//not threadsafe
public class HashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("a", 100);
        hashMap.put("b", 200);
        hashMap.put("c", 300);
        hashMap.put("d", 400);

        // insert null as value
        hashMap.put("e", null);

        //insert null as key
        hashMap.put(null, 500);

        //remove
        hashMap.remove("d");

        // duplicate keys - it override the value
        hashMap.put("a", 200);

        for (Map.Entry<String, Integer> mapEntry: hashMap.entrySet()) {
            System.out.println(mapEntry.getKey() + "  --  "+ mapEntry.getValue());
        }
    }
}
