package VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Elements> goods = new ArrayList<>();

    public void add(Elements element){
        goods.add(element);
    }

    public void removeElement(Elements element){
        goods.remove(element);
    }

    public void accept(Visitor visitor){
        goods.forEach(element->element.accept(visitor));
    }
}
