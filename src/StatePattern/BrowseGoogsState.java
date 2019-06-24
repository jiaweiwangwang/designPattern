package StatePattern;

public class BrowseGoogsState implements GoShoppingState {
    @Override
    public void operate(Context context) {
        context.changeState(new PlaceOrderState());
        System.out.println("买家正在浏览商品");
    }
}
