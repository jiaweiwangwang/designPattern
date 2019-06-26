package MementoPattern;

import org.junit.Test;

public class MementoDemo {
    @Test
    public void run(){
        GamePlayer gamePlayer = new GamePlayer();
        gamePlayer.show();
        Caretacker caretacker = new Caretacker();
        //保存目前的状态
        caretacker.setMemento(gamePlayer.createMemento());
        System.out.println("正在闯关");
        gamePlayer.setAttack(80);
        gamePlayer.setDefense(50);
        gamePlayer.setLife(20);
        gamePlayer.show();
        System.out.println("感觉闯关失败，想要返回到初始状态重新再来");
        gamePlayer.recoverState(caretacker.getMemento());
        gamePlayer.show();
    }
}
