package SimpleFactoryPattern;

public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getInputNumberA()-getInputNumberB();
    }
}
