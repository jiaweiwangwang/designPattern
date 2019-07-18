package VisitorPattern;

public interface Visitor {
    void visit(Cup cup); //定义访问者中，访问商品杯子的方法
    void visit(Computer computer);//定义访问者中，访问商品电脑的方法
}
