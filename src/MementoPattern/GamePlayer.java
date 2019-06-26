package MementoPattern;

public class GamePlayer {
    private int defense; //防御力
    private int attack; //攻击力
    private int life; //生命力
    public GamePlayer(){
        this.defense = 100;
        this.attack = 100;
        this.life = 100;
    }
    public Memento createMemento(){
        return new Memento(defense,attack,life);
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void recoverState(Memento memento){
        this.defense = memento.getDefense();
        this.attack = memento.getAttack();
        this.life = memento.getLife();
    }
    public void show(){
        System.out.println("目前的状态为：攻击力="+attack+"，防御力="+defense+",生命值="+life);
    }
}
