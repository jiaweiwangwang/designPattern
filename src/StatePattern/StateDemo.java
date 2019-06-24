package StatePattern;

import org.junit.Test;

public class StateDemo {
    @Test
    public void run(){
        Context context = new Context();
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
    }
}
