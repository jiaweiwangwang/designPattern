package CommandPattern;

/**
 * 发送做汉堡命令的类
 */
public class MakeBurgerCommand extends  Command {
    public MakeBurgerCommand(Kitchen receiver) {
        super(receiver);
    }

    @Override
    public void executorCommand() {
        receiver.makeBurger();
    }
}
