package InterpreterPattern;

import java.util.HashSet;
import java.util.Set;

public class TerminalExpression implements Expression {
    private Set<String> set = new HashSet<>();
    public TerminalExpression(String [] datas){
        for(String data : datas){
            set.add(data);
        }
    }
    @Override
    public boolean interpret(String context) {
        if(set.contains(context)){
            return true;
        }
        return false;
    }
}
