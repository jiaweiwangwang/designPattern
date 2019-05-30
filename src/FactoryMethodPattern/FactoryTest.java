package FactoryMethodPattern;

import org.junit.Test;

public class FactoryTest {
    @Test
    public void run(){
        IFactory addFactory = new AddFactory();
        OperationAdd addOperation = (OperationAdd) addFactory.createOperation();
        addOperation.setInputNumberA(123);
        addOperation.setInputNumberB(234);
        System.out.println(addOperation.getResult());
    }

}
