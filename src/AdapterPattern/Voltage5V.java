package AdapterPattern;

/**
 * 新的接口实现类
 */
public class Voltage5V implements VoltageOutput5Plugin{
    @Override
    public void output() {
        System.out.println("5V电压");
    }
}
