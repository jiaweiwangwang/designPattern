package StrategyPattern;

import org.junit.Test;

public class SelectionSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
    //This method is used to test SelectionSort
    @Test
    public void run(){
        int [] arr = {2,3,1,6,4,5};
        for(int i : sort(arr)){
            System.out.println(i);
        }
    }
}
