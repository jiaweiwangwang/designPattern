package FactoryMethodPattern;

public class OperationAdd extends Operation {
    @Override
    public double getResult(){
        return getInputNumberA()+getInputNumberB();
    }
}
