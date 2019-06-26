package AdapterPattern;

import org.junit.Test;

public class AdapterDemo {
    @Test
    public void run(){
        VoltageFive voltage = new VoltageAdapter();
        voltage.outputFiveV();
    }

}
