package Composite;

import java.util.ArrayList;
import java.util.List;

// 3. 组合节点
class Composite extends Component {
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Composite: " + name);
        for (Component child : children) {
            child.showDetails();
        }
    }

    public static void main(String[] args) {
        Component leaf1 = new Leaf("Leaf 1");
        Component leaf2 = new Leaf("Leaf 2");

        Composite composite = new Composite("Composite 1");
        composite.add(leaf1);
        composite.add(leaf2);

        Component leaf3 = new Leaf("Leaf 3");
        Composite root = new Composite("Root");
        root.add(composite);
        root.add(leaf3);

        root.showDetails();
    }
}