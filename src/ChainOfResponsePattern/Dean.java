public class Dean extends Handler {
    @Override
    public void handleRequest(double day) {
        if(day<7){
            System.out.println("您的假期大于3天小于7天，院长给你批的假期");
        }else{
            System.out.println("大于7天，谁也批准不了只能呵呵了");
        }
    }
}
