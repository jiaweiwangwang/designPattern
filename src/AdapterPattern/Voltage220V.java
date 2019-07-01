package AdapterPattern;

public class Voltage220V {
    private static final int output = 220;
    public int output220v(){
        System.out.println("原始的输出电压为："+output);
        return output;
    }
}
