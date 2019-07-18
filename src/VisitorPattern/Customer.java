package VisitorPattern;

public class Customer implements Visitor {
    @Override
    public void visit(Cup cup) {
        System.out.println("我是顾客，我正在查看杯子的价格，我只关心杯子的性价比");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("我是顾客，我正在查看电脑的价格，我只关心电脑的性价比");
    }
}
