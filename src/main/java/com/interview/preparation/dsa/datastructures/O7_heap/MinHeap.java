package com.interview.preparation.dsa.datastructures.O7_heap;

import javax.imageio.stream.ImageOutputStreamImpl;
import java.util.Arrays;

public class MinHeap {
    int[] minHeap;
    int heapSize;
    int realSize = 0;

    public MinHeap(int heapSize){
        this.heapSize = heapSize;
        minHeap = new int[heapSize+1];
        minHeap[0] = 0;
    }

    //leaf left child.. campare with parent and place at right location
    public void add(int element){
        realSize++;
        if(realSize > heapSize){
            System.out.println("No space");
            realSize--;
            return;
        }
        minHeap[realSize] = element;
        int index = realSize;

        int parent = index/2;
        while(minHeap[index] < minHeap[parent] && index > 1){
            int temp = minHeap[index];
            minHeap[index] = minHeap[parent];
            minHeap[parent] = temp;
            index = parent;
            parent = index/2;
        }
    }

    public int peek(){
        return minHeap[1];
    }

    public int pop(){
        if(realSize < 1){
            System.out.println("No elements in min Heap");
            return Integer.MAX_VALUE;
        }
        int removeElement = minHeap[1];
        minHeap[1] = minHeap[realSize];
        realSize--;
        int index = 1;
        while(index < realSize/2){
            int left = index *2;
            int right = (index*2) + 1;
            if(minHeap[index] > minHeap[left] || minHeap[index] > minHeap[right]){
                if(minHeap[left] < minHeap[right]){
                    int temp = minHeap[left];
                    minHeap[left] = minHeap[index];
                    minHeap[index] = temp;
                    index = left;
                }else{
                    int temp = minHeap[right];
                    minHeap[right] = minHeap[index];
                    minHeap[index]= temp;
                    index = right;
                }
            }
            else{
                break;
            }
        }
        return removeElement;
    }
    @Override
    public String toString() {
        if(realSize == 0 ){
            return "No Element";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
       for(int i=1;i<= realSize;i++){
           sb.append(minHeap[i]);
           sb.append(",");
       }
       sb.deleteCharAt(sb.length()-1);
       sb.append("]");
       return sb.toString();
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(3);
        minHeap.add(3);
        minHeap.add(1);
        minHeap.add(2);

        System.out.println(minHeap);

        System.out.println(minHeap.peek());

        System.out.println(minHeap.pop());
        System.out.println(minHeap);
        System.out.println(minHeap.peek());

    }
}
