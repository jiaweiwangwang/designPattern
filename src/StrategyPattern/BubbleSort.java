package StrategyPattern;

import org.junit.Test;

public class BubbleSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    //This method is used to test BubbleSort
    @Test
    public void run() {
        int[] arr = {2, 3, 1, 6, 4, 5};
        for (int i : sort(arr)) {
            System.out.println(i);
        }
    }
}
