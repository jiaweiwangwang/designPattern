package TemplatePattern;

public class HonorOfKings extends Game {

    @Override
    protected void initialize() {
        System.out.println("王者荣耀正在初始化，请稍后");
    }

    @Override
    protected void startGame() {
        System.out.println("王者荣耀初始化完成，请开始游戏");
    }

    @Override
    protected void endGame() {
        System.out.println("王者荣耀结束");
    }
}
