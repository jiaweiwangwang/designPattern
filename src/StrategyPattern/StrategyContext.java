package StrategyPattern;

import org.junit.Test;

public class StrategyContext {
    private Sort ISort;

    public StrategyContext(Sort sort) {
        this.ISort = sort;
    }

    public StrategyContext() {
    }

    public int[] contextMethod(int[] arr) {
        return ISort.sort(arr);
    }
}
