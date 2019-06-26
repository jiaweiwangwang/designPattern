package MementoPattern;

public class Memento {
    private int defense; //防御力
    private int attack; //攻击力
    private int life; //生命力
    public Memento(int defense,int attack,int life){
        this.defense = defense;
        this.attack = attack;
        this.life = life;
    }
    public int getDefense() {
        return defense;
    }
    public int getAttack() {
        return attack;
    }
    public int getLife() {
        return life;
    }
}
