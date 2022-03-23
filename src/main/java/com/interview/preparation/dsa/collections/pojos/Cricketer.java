package com.interview.preparation.dsa.collections.pojos;

public class Cricketer implements Comparable<Cricketer> {
    private int runs;
    private String name;

    public Cricketer(String name,int runs) {
        this.runs = runs;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "   " + runs;
    }

    @Override
    public int compareTo(Cricketer cricketer) {
        if(this.runs > cricketer.runs){
            return 1;
        } else if(this.runs > cricketer.runs){
            return -1;
        } else {
            return 0;
        }
    }
}
