package StatePattern;

public class Context {
    private GoShoppingState current;
    //初始化状态为用户浏览商品
    public Context(){
        current = new BrowseGoogsState();
    }
    public void changeState(GoShoppingState goShoppingState){
        this.current = goShoppingState;
    }

    public void request(){
        current.operate(this);
    }
}
