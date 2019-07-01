package AdapterPattern;

import org.junit.Test;

public class AdapterDemo {
    @Test
    public void run(){
        // 旧的接口接受一个适配器，该适配器的输出是新类的输出
        VoltageOutput220Plugin voltage = new VoltageAdapter();
        voltage.output();
    }

}
