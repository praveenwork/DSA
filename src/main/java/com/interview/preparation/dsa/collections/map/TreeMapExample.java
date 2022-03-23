package com.interview.preparation.dsa.collections.map;

import java.util.Map;
import java.util.TreeMap;

//Key-value pair
//nulls are not allowed for Keys but allowed for values
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("X" , 200);
        treeMap.put("A" , 200);
        treeMap.put("K" , 200);
        treeMap.put("B" , 200);
        treeMap.put("C" ,null);

        //not allowed
        //treeMap.put(null ,300);

        for(Map.Entry<String, Integer> mapEntry : treeMap.entrySet()){
            System.out.println(mapEntry.getKey()+ "=== "+ mapEntry.getValue());
        }
    }
}
