package com.interview.preparation.dsa.collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SyncronizedHashmapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();

        hashmap.put("A", 100);
        hashmap.put("B", 200);
        hashmap.put("C", 300);
        hashmap.put("D", 400);

        hashmap = Collections.synchronizedMap(hashmap);

        for (Map.Entry<String,Integer> mapEntry: hashmap.entrySet()) {
            System.out.println(mapEntry.getKey() + " - "+ mapEntry.getValue());
        }

    }
}
