package MediatorPattern;

public class China implements  Station {
    private Mediator mediator;
    public China(Mediator mediator) {
        this.mediator = mediator;
    }
    @Override
    public void send(String message) {
        mediator.send(message+"我想和你商谈大事，你可愿意？",this);
    }
    @Override
    public void receive() {
        System.out.println("中国已经收到消息");
    }
}
