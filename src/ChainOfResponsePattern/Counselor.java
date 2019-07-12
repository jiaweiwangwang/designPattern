public class Counselor extends Handler {
    @Override
    public void handleRequest(double day) {
        if(day<3){
            System.out.println("您请假的天数大于1天小于3天，事辅导员给你批的假期");
        }else{
            handler.handleRequest(day);
        }
    }
}
