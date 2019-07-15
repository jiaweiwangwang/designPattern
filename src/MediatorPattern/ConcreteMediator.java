package MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    private List<Station> countries = new ArrayList<Station>();
    public ConcreteMediator() {
        super();
    }
    @Override
    public void add(Station station) {
        if (!countries.contains(station)) {
            countries.add(station);
        } else {
            System.out.println("您已经加入过联合国了");
        }
    }
    @Override
    public void send(String message, Station country) {
        for (Station station : countries) {
            if (!country.equals(station)) {
                country.receive();
            }
        }
    }
}
