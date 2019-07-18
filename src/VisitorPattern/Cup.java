package VisitorPattern;

/**
 * 具体的商品杯子，实现了Elmentse接口
 */
public class Cup implements Elements {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
