package CompositePattern;

import org.junit.Test;

public class CompositeDemo {
    @Test
    public void  run(){
        Component root = new Composite();
        Component branch = new Composite();
        Component leafOne = new Leaf("leaf1");
        Component leafTwo = new Leaf("leaf2");
        Component leafThree = new Leaf("leaf3");
        //构建树的过程
        ((Composite) root).add(leafOne);
        ((Composite) root).add(branch);
        ((Composite) branch).add(leafTwo);
        ((Composite) branch).add(leafThree);
        //遍历树
        root.operation();
    }
}
