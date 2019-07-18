package InterpreterPattern;

public class Context {
    private String [] cities = {"A","B","C"};
    private String [] person = {"老人","儿童"};
    private NonTerminalExpression nonTerminal;
    public Context(){
        TerminalExpression terminalOne = new TerminalExpression(cities);
        TerminalExpression terminalTwo = new TerminalExpression(person);
        nonTerminal = new NonTerminalExpression(terminalOne,terminalTwo);

    }
    public void test(String info){
        boolean ok = nonTerminal.interpret(info);
        if(ok){
            System.out.println("您可以免费乘车");
        }else{
            System.out.println("您不可以免费乘车");
        }
    }
}
