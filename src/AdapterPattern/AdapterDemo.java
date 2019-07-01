package AdapterPattern;

import org.junit.Test;

public class AdapterDemo {
    @Test
    public void run(){
        VoltageFive voltage = new VoltageAdapter();
        int changedVoltage = voltage.outputFiveV();
        System.out.println("输出电压为："+changedVoltage);
    }

}
