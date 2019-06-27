package CompositePattern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Composite implements Component {
    private List<Component> componentsList = new ArrayList<>();
    public void add(Component component) {
        componentsList.add(component);
    }
    public void remove(Component component) {
        componentsList.remove(component);
    }
    public Component getChildComponent(int i) {
        return componentsList.get(i);
    }
    @Override
    public void operation() {
        for (Component component : componentsList) {
            component.operation();
        }
    }
}
