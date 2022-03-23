package com.interview.preparation.dsa.datastructures.O5_binarytree;

class TreeArray{
        static int root = 0;
        static String[] str = new String[10];

        public void root(String root){
            str[0] = root;
        }

        public void setLeft(String data, int parent){
            int t = (parent * 2) + 1;
            if(str[parent] == null){
                return;
            }
            str[t]  = data;
        }

        public void setRight(String data, int parent){
            if(str[parent] == null){
                return;
            }
            int t  = (parent * 2) + 2;
            str[t] = data;
        }

        public void printTree(){
            for( int i =0;i < 10;i++) {
                if(str[i] != null){
                    System.out.print(str[i] + " ");
                }else {
                    System.out.print("-");
                }

            }
        }
}


public class BinaryTreeWithArrays {
    public static void main(String[] args) {
        TreeArray treeArray = new TreeArray();
        treeArray.root("A");
        treeArray.setRight("C", 0);
        treeArray.setLeft("D", 0);
        treeArray.setRight("E", 1);
        treeArray.setLeft("F", 2);
String
        treeArray.printTree();
    }

}
