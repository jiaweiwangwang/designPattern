package ProxyPattern;

import org.junit.Test;

public class ProxyTest {
    @Test
    public void run(){
        StudentProxy proxy = new StudentProxy();
        proxy.setStudent(new Student("小张"));
        proxy.giveHousework();
    }

}
