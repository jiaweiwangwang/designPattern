package MediatorPattern;

import org.junit.Test;

public class Client {
    @Test
    public void run(){
      Mediator mediator = new ConcreteMediator();
      Station china = new China(mediator);
      Station pakistan = new Pakistan(mediator);

      //让国家加入联合国
        mediator.add(china);
        mediator.add(pakistan);

        china.send("巴基斯坦，你好");
        System.out.println("--------------------");
        pakistan.send("中国，您好");

    }
}
