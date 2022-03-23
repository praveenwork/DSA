package com.interview.preparation.dsa.problemsolving.string;

import java.sql.Date;
import java.util.*;

public class ListAnangrams {
    public static void main(String[] args) {
        String[] input = {"eat" ,"tea" ,"tan" ,"ate" ,"nat" ,"bat"};
        List<List<String>> result = getAnagrams(input);
        if(result != null) {
            for (List<String> group : result) {
                for (String res : group) {
                    System.out.println(res + " ");
                }
                System.out.println("");
            }
        }
        //[ate,eat, tea], [nat, tan], [bat]

    }
    private static List<List<String>> getAnagrams(String[] strs) {
        List<List<String>> finalResult = new ArrayList<>();
        Map<String, List<String>> result = new HashMap<>();

        if(strs == null || strs.length == 0 ) return null;
        List<String> resultGroup = new ArrayList<>();
        for(String input: strs){
            char[] inputArray = input.toCharArray();
            Arrays.sort(inputArray);
            String sortedStr = new String(inputArray);
            if(result.get(sortedStr) != null){
                resultGroup =   result.get(sortedStr);
                resultGroup.add(input);
                result.put(sortedStr,resultGroup);
            } else {
                resultGroup = new ArrayList<>();
                resultGroup.add(input);
                result.put(sortedStr,resultGroup);
            }
        }
        for(Map.Entry<String, List<String>> mapEntry: result.entrySet()){
            finalResult.add(mapEntry.getValue());
        }
        return finalResult;
    }
}