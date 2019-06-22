package OberverPattern;

public class SubscribeOne implements  IObserver {
    private String name;
    public SubscribeOne(String name){
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("新的一期报纸已经更新，请"+name+"前来取报纸");
    }
}
