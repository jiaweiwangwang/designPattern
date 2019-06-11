package TemplatePattern;

public abstract class Game {
    //这里将playGame方法定义为final是不允许让子类重写该方法
    public final void playGame(){
        //游戏初始化
        this.initialize();
        //开始游戏
        this.startGame();
        //游戏结束
        this.endGame();
    }

    //定义抽象方法让子类去实现
    protected abstract void initialize();
    protected abstract void startGame();
    protected abstract void endGame();

}
