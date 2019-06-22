package OberverPattern;

import org.junit.Test;

public class OberverDemo {
    @Test
    public void run(){
        //观察目标
        ISubject subject = new ConcreteSubject();
        //生成观察者
        IObserver observerOne = new SubscribeOne("小明");
        IObserver observerTwo = new SubscribeOne("小王");
        IObserver observerThree = new SubscribeOne("小刘");
        //将观察者加入到观察目标中
        subject.attach(observerOne);
        subject.attach(observerTwo);
        subject.attach(observerThree);
        //观察目标的状态改变
        ((ConcreteSubject) subject).setState("状态改变");
        //对观察者发出通知，观察者做出相应的动作
        subject.notifyOberver();

    }
}
