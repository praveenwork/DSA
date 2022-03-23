package com.interview.preparation.dsa.datastructures.O12_tries;

import java.util.*;

public class WordBreak {

    Set<String> dict;
    HashMap<String,Boolean> cache = new HashMap<>();

    public boolean wordBreak(String s, List<String> wordDict){
        dict = new HashSet<>(wordDict);
        return helper(s);
    }


    private boolean helper(String word){
        if(word == null || word.length() == 0 ) return  true;
        if(cache.containsKey(word)) return  cache.get(word);
        int n = word.length();
        for(int i = 1; i <= n; i++){
            String left = word.substring(0,i);
            String right = word.substring(i,n);
            if(dict.contains(left) && helper(right)){
                cache.put(word, true);
                return true;
            }
        }
        cache.put(word, false);
        return false;

    }


    public static void main(String[] args) {
        WordBreak wordBreak = new WordBreak();
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        System.out.println(wordBreak.wordBreak("leetcode", wordDict));
    }
}
