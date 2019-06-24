package AbstractFactoryPattern;

public class GreeAirCondition implements IAirCondition {

    @Override
    public void showAirCondition() {
        System.out.println("格力空调");
    }
}
