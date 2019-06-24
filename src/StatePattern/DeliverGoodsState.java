package StatePattern;

public class DeliverGoodsState implements GoShoppingState {
    @Override
    public void operate(Context context) {
        context.changeState(new TransportGoodsState());
        System.out.println("卖家已发货");
    }
}
