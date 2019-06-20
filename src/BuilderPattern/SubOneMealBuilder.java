package BuilderPattern;

public class SubOneMealBuilder extends MealBuilder {

    @Override
    public void buildFood() {
        meal.setFood("米饭");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("苹果汁");
    }
}
