package StrategyPattern;

import org.junit.Test;

public class TestDemo {
    @Test
    public void TestSort() {
        Sort ISort = new BubbleSort();
        StrategyContext context = new StrategyContext(ISort);
        int[] arr = {2, 3, 1, 6, 4, 5};
        for (int i : context.contextMethod(arr)) {
            System.out.println(i);
        }
    }
}
