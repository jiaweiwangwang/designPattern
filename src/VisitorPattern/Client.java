package VisitorPattern;

import org.junit.Test;

public class Client {
    @Test
    public void run(){
        //生成两个访问者
        Customer customer = new Customer(); //顾客
        Cashier cashier = new Cashier(); //收银员

        //往购物车中添加商品
        ShoppingCart shoppingCart = new ShoppingCart(); //实例化一个购物车

        //实例化两个商品
        Elements cup = new Cup();
        Elements computer = new Computer();

        //添加到购物车中
        shoppingCart.add(cup);
        shoppingCart.add(computer);

        //不同的访问者访问购物车中的商品
        shoppingCart.accept(customer);
        shoppingCart.accept(cashier);
    }
}
