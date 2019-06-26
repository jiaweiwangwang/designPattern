package AdapterPattern;

public class VoltageAdapter implements VoltageFive {
    private Voltage220V voltage220V;
    public VoltageAdapter(){
        new Voltage220V();
    }
    @Override
    public void outputFiveV() {
        System.out.println("源电压是220v,已经转换成5.1v电压");
    }
}
