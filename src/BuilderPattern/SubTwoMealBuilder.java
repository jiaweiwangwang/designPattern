package BuilderPattern;

public class SubTwoMealBuilder extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("披萨");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("西瓜汁");
    }
}
