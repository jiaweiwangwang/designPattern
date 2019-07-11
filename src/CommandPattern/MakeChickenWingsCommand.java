package CommandPattern;

/**
 * 发送做鸡翅的命令类
 */
public class MakeChickenWingsCommand extends Command {
    public MakeChickenWingsCommand(Kitchen receiver) {
        super(receiver);
    }

    @Override
    public void executorCommand() {
        receiver.makeChickenWings();
    }
}
