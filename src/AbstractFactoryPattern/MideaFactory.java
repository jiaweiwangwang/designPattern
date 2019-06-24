package AbstractFactoryPattern;

public class MideaFactory implements IFactory {
    @Override
    public ITelevision produceTelevision() {
        return new MideaTelevision();
    }

    @Override
    public IAirCondition productionAirCondition() {
        return new MideaAirCondition();
    }

}
