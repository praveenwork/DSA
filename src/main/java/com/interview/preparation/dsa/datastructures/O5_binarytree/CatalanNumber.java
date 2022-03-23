package com.interview.preparation.dsa.datastructures.O5_binarytree;

public class CatalanNumber {

    private int catalan(int n){
        int result = 0;
        if(n == 0){ // no nodes
            return 1;
        }
        if(n == 1){ // 1 root node
            return 1;
        }
        for(int i=1; i<=n; i++){
            result += catalan(i-1)*catalan(n-i);
        }
        return result;
    }

    public static void main(String[] args) {
        CatalanNumber catalanNumber = new CatalanNumber();
        for(int i=0; i< 10;i++){
            System.out.println("i = "+ i + ": catalan: " + catalanNumber.catalan(i));
        }
    }
}
