package FacadePattern;

import org.junit.Test;

public class TestDemo {
    @Test
    public void run(){
        Facade computer = new Facade();
        computer.start();
        /**
         * computer do something
         */
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        computer.shutdown();
    }
}
