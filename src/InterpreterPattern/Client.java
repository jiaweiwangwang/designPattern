package InterpreterPattern;

import org.junit.Test;

public class Client {
    @Test
    public void run(){
        Context context = new Context();
        context.test("A的老人");
        context.test("D的老人");
        context.test("C的儿童");
        context.test("F的儿童");


    }
}
