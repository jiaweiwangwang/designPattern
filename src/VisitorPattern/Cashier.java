package VisitorPattern;

public class Cashier implements Visitor {
    @Override
    public void visit(Cup cup) {
        System.out.println("我是收银员，我正在计算杯子的价格");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("我是收银员，我正在计算电脑的价格");
    }
}
