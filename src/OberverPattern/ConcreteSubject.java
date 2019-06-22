package OberverPattern;

import java.util.LinkedList;
import java.util.List;

public class ConcreteSubject implements ISubject {
    protected static final List<IObserver> obsevers = new LinkedList<IObserver>();
    private String state;

    @Override
    public void attach(IObserver observer) {
        obsevers.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        obsevers.remove(observer);
    }

    @Override
    public void notifyOberver() {
        for (IObserver observer : obsevers
        ) {
            observer.update();
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
