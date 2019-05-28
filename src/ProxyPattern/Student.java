package ProxyPattern;

public class Student implements Person {
    public String name;
    public Student(String name){
        this.name = name;
    }
    @Override
    public void giveHousework() {
        System.out.println(name+" : 交了50元");
    }
}
