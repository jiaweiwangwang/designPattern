package SimpleFactoryPattern;

import java.util.Scanner;

public class OperationDemo {
    public static void main(String [] args){
        Operation oper;
        System.out.print("please select operation from(+,-,*,/)：");
        Scanner in = new Scanner(System.in);
        String operation = in.nextLine();
        oper = OperationFactory.createOperate(operation);
        oper.setInputNumberA(in.nextDouble());
        oper.setInputNumberB(in.nextDouble());
        try{
            System.out.println(oper.getResult());
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
