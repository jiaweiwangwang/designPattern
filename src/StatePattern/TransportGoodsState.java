package StatePattern;

public class TransportGoodsState implements  GoShoppingState {
    @Override
    public void operate(Context context) {
        context.changeState(new ReceiveGoodsState());
        System.out.println("货物正在运输");
    }
}
