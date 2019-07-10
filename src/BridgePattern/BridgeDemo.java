import org.junit.Test;

public class BridgeDemo {
    @Test
    public void run(){
        //红色M型
        Automobile car = new TypeM();
        Color color = new Red();
        car.setColor(color);
        car.paintColor();
        //黄色P型
        car = new TypeP();
        color = new Yellow();
        car.setColor(color);
        car.paintColor();
    }

}
