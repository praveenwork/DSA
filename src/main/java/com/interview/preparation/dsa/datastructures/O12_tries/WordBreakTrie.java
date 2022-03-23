package com.interview.preparation.dsa.datastructures.O12_tries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreakTrie {

    private class TrieNode {
        Map<Character,TrieNode> children;
        boolean endOfWorld;
        public TrieNode(){
            children = new HashMap<>();
            endOfWorld = false;
        }
    }

    private  TrieNode root;

    public WordBreakTrie(){
        root = new TrieNode();
    }

    private void insert(String word){
        TrieNode currentNode = root;
        for(int i = 0;i< word.length();i++){
            char ch = word.charAt(i);
            TrieNode node  = currentNode.children.get(ch);
            if(node == null){
                node = new TrieNode();
                currentNode.children.put(ch, node);
            }
            currentNode = node;
        }
        currentNode.endOfWorld = true;
    }

    public boolean wordBreak(String s, List<String> wordDict){
        // crate the Trie Dictionary
        for (String word: wordDict) {
            insert(word);
        }
        return checkWord(root, s, 0);
    }

    private boolean checkWord(TrieNode node, String word, int index){
        if(index == word.length()){
            return node.endOfWorld;
        }
        if(node.endOfWorld == true){
            return true;
        }
        char ch = word.charAt(index);
        TrieNode currentNode = node.children.get(ch);
        if(currentNode == null){
            return false;
        }
        return checkWord(currentNode, word, index+1);
    }


    public static void main(String[] args) {
        WordBreakTrie wordBreak = new WordBreakTrie();
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");

        System.out.println(wordBreak.wordBreak("leetcode", wordDict));

    }

}
