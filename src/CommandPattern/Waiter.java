package CommandPattern;

import java.util.LinkedList;
import java.util.List;

/**
 * 服务员类，用来将用户的需求转换成相应的命令发送
 * 给厨房（接收者）
 */
public class Waiter {
    private List<Command> orders = new LinkedList<>();
    public void setOrders(Command command){
        orders.add(command);
    }
    public void cancelOrder(Command command){
        orders.remove(command);
    }
    //省略修改订单等操作
    public void notifyReceiver(){
        for (Command command : orders) {
            command.executorCommand();
        }
    }
}
