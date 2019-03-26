package SimpleFactoryPattern;

public abstract class Operation {
    private double inputNumberA;
    private double inputNumberB;

    public double getInputNumberA() {
        return inputNumberA;
    }

    public void setInputNumberA(double inputNumberA) {
        this.inputNumberA = inputNumberA;
    }

    public double getInputNumberB() {
        return inputNumberB;
    }

    public void setInputNumberB(double inputNumberB) {
        this.inputNumberB = inputNumberB;
    }

    public abstract double getResult() throws Exception;

}
