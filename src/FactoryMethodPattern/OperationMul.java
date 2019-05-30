package FactoryMethodPattern;

public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return getInputNumberA()*getInputNumberB();
    }
}
