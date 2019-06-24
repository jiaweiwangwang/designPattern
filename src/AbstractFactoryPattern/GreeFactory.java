package AbstractFactoryPattern;

public class GreeFactory implements IFactory {
    @Override
    public ITelevision produceTelevision() {
        return new GreeTelevision();
    }

    @Override
    public IAirCondition productionAirCondition() {
        return new GreeAirCondition();
    }
}
