package AdapterPattern;

public class VoltageAdapter implements VoltageFive {
    private Voltage220V voltage220V;
    public VoltageAdapter(){
        voltage220V = new Voltage220V();
    }
    @Override
    public int outputFiveV() {
        System.out.println("电压的适配器");
        int input = voltage220V.output220v();
        int output = input/44;
        System.out.println("输入电压为："+input+";输出电压为："+output);
        return output;
    }
}
