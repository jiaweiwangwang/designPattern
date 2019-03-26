package StrategyPattern;

import org.junit.Test;

public class InsertionSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int preIndex = i - 1;
            int curentValue = arr[i];
            while (preIndex >= 0 && curentValue < arr[preIndex]) {
                arr[preIndex+1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex+1] = curentValue;
        }
        return arr;
    }
    //This method is used to test InsertionSort
    @Test
    public void run(){
        int [] arr = {2,3,1,6,4,5};
        for(int i : sort(arr)){
            System.out.println(i);
        }
    }
}
