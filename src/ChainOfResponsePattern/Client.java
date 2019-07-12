import org.junit.Test;

public class Client {
    @Test
    public void run(){
        Handler squadLeader = new SquadLeader();  //班长能处理就处理，否则转向辅导员
        Handler consetor = new Counselor(); //辅导员处理，否则转向院长
        Handler dean = new Dean();  //院长处理，否则拒绝

        squadLeader.setHandler(consetor); // 设置班长的上一级是辅导员
        consetor.setHandler(dean); //设置辅导员的上一级是院长
        //测试
        squadLeader.handleRequest(0.1);
        squadLeader.handleRequest(2);
        squadLeader.handleRequest(5);
        squadLeader.handleRequest(9);
    }
}
