package com.interview.preparation.dsa.collections.list;

import java.util.List;
import java.util.Vector;

//dynamic Array
public class VectorExample {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);

        for(int i=0;i<100;i++){
            vector.add(i);
        }

        System.out.println(vector);
        System.out.println(vector.size());
        System.out.println(vector.capacity());

        //updating
        vector.set(0,100000);
        System.out.println(vector);

        //remove
        vector.remove(0);
        System.out.println(vector);
    }
}
