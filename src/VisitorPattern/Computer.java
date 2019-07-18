package VisitorPattern;

/**
 * 具体的商品电脑，实现了Elmentse接口
 */
public class Computer implements Elements {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
