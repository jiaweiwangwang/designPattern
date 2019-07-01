package AdapterPattern;

/**
 * 旧接口实现类
 */
public class Voltage220V implements VoltageOutput220Plugin{
    public void output(){
        System.out.println("220v电压");
    }
}
