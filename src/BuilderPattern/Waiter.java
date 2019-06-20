package BuilderPattern;

public class Waiter {
    private MealBuilder mealBuilder;
    public Waiter(MealBuilder mealBuilder){
        this.mealBuilder = mealBuilder;
    }
    public Meal getMeal(){
        mealBuilder.buildDrink();
        mealBuilder.buildFood();
        return mealBuilder.getMeal();
    }
}
