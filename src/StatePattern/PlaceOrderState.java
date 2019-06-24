package StatePattern;

public class PlaceOrderState implements GoShoppingState {
    @Override
    public void operate(Context context) {
        context.changeState(new DeliverGoodsState());
        System.out.println("客户正在下订单");
    }
}
