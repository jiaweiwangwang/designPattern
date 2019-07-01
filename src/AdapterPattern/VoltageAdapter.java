package AdapterPattern;

/**
 * (这是一个对象适配器)
 * 1. 适配器实现旧接口方法
 * 2. 持有或接收一个新接口实现方法的实例
 * 3. 旧接口的方法中，采用新接口实例的输出进行重写
 */
public class VoltageAdapter implements VoltageOutput220Plugin {
    private Voltage5V voltage5V; // 新实例
    private Voltage220V voltage220V; // 旧的实例并不是必需的
    public VoltageAdapter(){
        voltage5V = new Voltage5V();
        voltage220V = new Voltage220V();
    }

    /**
     * 保持相同的接口
     */
    @Override
    public void output() {
        System.out.println("收到"); // 这部分并不是必要的
        voltage220V.output();
        System.out.println("输出");
        voltage5V.output(); // 调用新实列的方法
    }
}
