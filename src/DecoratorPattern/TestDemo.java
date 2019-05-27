package DecoratorPattern;

import org.junit.Test;

public class TestDemo {
    @Test
    public void test(){
        Transform transform = new Car();
        Robot robot = new Robot();
        robot.setTransform(transform);
        robot.say();
        Airplan airplan = new Airplan();
        airplan.setTransform(transform);
        airplan.fly();
    }
}
