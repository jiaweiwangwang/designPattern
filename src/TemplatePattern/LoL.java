package TemplatePattern;

public class LoL extends Game {

    @Override
    protected void initialize() {
        System.out.println("LoL 正在初始化游戏，请稍后");
    }

    @Override
    protected void startGame() {
        System.out.println("LoL 初始化完成，请稍开始游戏");
    }

    @Override
    protected void endGame() {
        System.out.println("LoL 结束");
    }
}
