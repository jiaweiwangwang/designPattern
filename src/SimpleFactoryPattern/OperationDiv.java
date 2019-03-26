package SimpleFactoryPattern;

public class OperationDiv extends Operation {
    @Override
    public double getResult() throws Exception {
        if(getInputNumberB()==0){
            System.out.println("the input is illegal");
            throw new Exception("the second's isn't zero");
        }else{
            return getInputNumberA()/getInputNumberB();
        }
    }
}
