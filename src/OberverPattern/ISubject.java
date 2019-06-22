package OberverPattern;

import java.util.LinkedList;
import java.util.List;

public interface ISubject {
    void attach(IObserver observer);
    void detach(IObserver observer);
    void notifyOberver();
}
