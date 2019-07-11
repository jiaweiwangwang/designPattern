package CommandPattern;

import org.junit.Test;

public class Client {
    @Test
    public void run(){
        //初始化厨房
        Kitchen receiver = new Kitchen();
        //客户点餐的命令
        MakeBurgerCommand burgerCommandOne = new MakeBurgerCommand(receiver);
        MakeBurgerCommand burgerCommandTwo = new MakeBurgerCommand(receiver);
        MakeBurgerCommand burgerCommandThree = new MakeBurgerCommand(receiver);
        MakeChickenWingsCommand chickenWingsCommandOne = new MakeChickenWingsCommand(receiver);
        MakeChickenWingsCommand chickenWingsCommandTwo = new MakeChickenWingsCommand(receiver);
        //服务员将命令发送给厨房
        Waiter waiter = new Waiter();
        waiter.setOrders(burgerCommandOne);
        waiter.setOrders(burgerCommandTwo);
        waiter.setOrders(burgerCommandThree);
        waiter.setOrders(chickenWingsCommandOne);
        waiter.setOrders(chickenWingsCommandTwo);
        waiter.notifyReceiver();
    }
}
