public class SquadLeader extends Handler {
    @Override
    public void handleRequest(double day) {
        if (day < 1) {
            System.out.println("你的假期小于1天，班长批准的假期");
        } else {
            handler.handleRequest(day);
        }
    }
}
