package com.interview.preparation.dsa.datastructures.O12_tries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreak2 {

    private class TrieNode{
        Map<Character, TrieNode> childern;
        boolean endOfWorld;
        String word;

        public TrieNode(){
            childern = new HashMap<>();
            endOfWorld = false;
            word = null;
        }
    }

    private final TrieNode root;

    public WordBreak2(){
        root = new TrieNode();
    }

    public void insert(String word){
        TrieNode currentNode = root;
        for(int i =0; i < word.length(); i++){
            char ch = word.charAt(i);
            TrieNode node = currentNode.childern.get(ch);
            if(node == null){
                node = new TrieNode();
                currentNode.childern.put(ch, node);
            }
            currentNode = node;
        }
        currentNode.word = word;
        currentNode.endOfWorld = true;
    }

    public List<String> wordBreak(String s, List<String> wordDict){
        for (String word: wordDict){
            insert(word);
        }
        List<String> result = new ArrayList<>();
        checkWord(s, root, 0,result);
        return result;
    }

    private boolean checkWord(String s, TrieNode node, int index,List<String> result){
        if(index == s.length()){
           return node.endOfWorld;
        }
        if(node.endOfWorld){
            result.add(node.word);
        }
        char ch = s.charAt(index);
        TrieNode currentNode = node.childern.get(ch);
        if(currentNode == null){
            return false;
        }
        return checkWord(s, currentNode,index +1, result);


    }

    public static void main(String[] args) {
        WordBreak2 wordBreak2 = new WordBreak2();
        List<String> wordDict = new ArrayList<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");
        String search = "catsanddog";

        List<String> words = wordBreak2.wordBreak(search, wordDict);
        for(String word: words){
            System.out.print(word + " ");
        }

    }
}
