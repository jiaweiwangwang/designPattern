package BuilderPattern;

import org.junit.Test;

public class BuilderDemo {
    @Test
    public void run() {
        Waiter waiter = new Waiter(new SubOneMealBuilder());
        Meal meal = waiter.getMeal();
        System.out.println("套餐一是：" + meal.getDrink() + meal.getFood());
        waiter = new Waiter(new SubTwoMealBuilder());
        meal = waiter.getMeal();
        System.out.println("套餐二是：" + meal.getDrink() + meal.getFood());
    }
}
