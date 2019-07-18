package InterpreterPattern;

public class NonTerminalExpression implements Expression {
    private Expression expressionOne,expressionTwo;
    public NonTerminalExpression(Expression expressionOne,Expression expressionTwo){
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }
    @Override
    public boolean interpret(String context) {
        String[] s = context.split("的");
        return expressionOne.interpret(s[0])&&expressionTwo.interpret(s[1]);
    }
}
