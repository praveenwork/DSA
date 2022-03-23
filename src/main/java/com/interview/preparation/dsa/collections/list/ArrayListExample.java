package com.interview.preparation.dsa.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<Integer> items = new ArrayList<>();
        items.add(100);
        items.add(200);

        System.out.println(items);
        for (Integer item : items) {
            System.out.println(item);
        }

        List<Integer> itemsList  = new ArrayList<>();
        itemsList.add(0,300);
        itemsList.add(1, 400);

        items.addAll(0, itemsList);
        System.out.println(items);

        //update an element
        items.set(0, 500);
        System.out.println(items);

        //Remove=
        items.remove(1);
        System.out.println(items);

        //size
        System.out.println(items.size());

        //indexOf
        System.out.println(items.indexOf(100));

        //remove
        items.add(100);
        items.add(100);

        items.remove(1);
        System.out.println(items);

        for(int i =0;i< items.size(); i++){
            System.out.println(items.get(i));
        }
    }
}
