package com.interview.preparation.dsa.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("X" , 200);
        linkedHashMap.put("A" , 200);
        linkedHashMap.put("K" , 200);
        linkedHashMap.put("B" , 200);

        for (Map.Entry<String, Integer> mapEntry: linkedHashMap.entrySet()) {
            System.out.println(mapEntry.getKey()+ " -- " + mapEntry.getValue());
        }
    }
}
