package StatePattern;

public class ReceiveGoodsState implements GoShoppingState {
    @Override
    public void operate(Context context) {
        System.out.println("客户已经收到货物");
    }
}
