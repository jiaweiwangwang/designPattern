package AbstractFactoryPattern;

import org.junit.Test;

public class AbstracTFactoryDemo {
    @Test
    public void run(){
        IFactory factory = new GreeFactory();
        ITelevision television = factory.produceTelevision();
       IAirCondition airCondition = factory.productionAirCondition();
        television.showTelevision();
        airCondition.showAirCondition();
        /*IFactory factory = new MideaFactory();
        ITelevision television = factory.produceTelevision();
        IAirCondition airCondition = factory.productionAirCondition();
        television.showTelevision();*/
    }
}
