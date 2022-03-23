package com.interview.preparation.dsa.datastructures.O12_tries;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    private class TrieNode{
        Map<Character, TrieNode> childern;
        boolean endOfWorld;

        public TrieNode() {
            childern = new HashMap<>();
            endOfWorld = false;
        }
    }

    private final TrieNode root;
    public Trie(){
        root = new TrieNode();
    }

    public void insert(String word){
        TrieNode currentNode = root;
        for(int i = 0;i< word.length(); i++){
            char ch = word.charAt(i);
            TrieNode node = currentNode.childern.get(ch);
            if(node == null){
                node = new TrieNode();
                currentNode.childern.put(ch, node);
            }
            currentNode = node;
        }
        currentNode.endOfWorld = true;
    }

    public boolean search(String word){
        TrieNode currentNode = root;
        boolean found = false;
        for(int i = 0;i< word.length(); i++){
            char ch = word.charAt(i);
            TrieNode node = currentNode.childern.get(ch);
            if(node == null){
                return false;
            }
            currentNode = node;
        }
        return currentNode.endOfWorld;
    }

    public boolean delete(String word){
        return deleteRecursive(word);
    }


    //--------recursive way----------
    public void insertRecursive(String word){
        insertRecursive(root, word,0);
    }
    private void insertRecursive(TrieNode node, String word, int index){
        if(index == word.length()){
            node.endOfWorld = true;
            return;
        }
        char ch = word.charAt(index);
        TrieNode currentNode = node.childern.get(ch);
        if(currentNode == null){
            currentNode = new TrieNode();
            node.childern.put(ch, currentNode);
        }
        insertRecursive(currentNode, word, index+1);
    }



    public boolean searchRecursive(String word){
        return searchRecursive(root, word, 0);
    }

    private boolean searchRecursive(TrieNode node, String word, int index){
        if(index == word.length()){
            return node.endOfWorld;
        }
        char ch = word.charAt(index);
        TrieNode currentNode = node.childern.get(ch);
        if(currentNode == null){
            return false;
        }
        return searchRecursive(currentNode, word, index+1);
    }

    public boolean deleteRecursive(String word){
        return deleteRecursive(root, word, 0);
    }

    private boolean deleteRecursive(TrieNode node, String word, int index){
        if(index == word.length()){
            if(!node.endOfWorld){
                return false;
            }
            node.endOfWorld = false;
            return node.childern.size() == 0;
        }

        char ch = word.charAt(index);
        TrieNode currentNode = node.childern.get(ch);
        if(currentNode == null){
            return false;
        }

        boolean isEligibleToDelete = deleteRecursive(currentNode, word, index + 1);

        if(isEligibleToDelete){
            currentNode.childern.remove(ch);
            return currentNode.childern.size() == 0;

        }

        return false;
    }






}
