package Composite;

// 2. 叶子节点
class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void showDetails() {
        System.out.println("Leaf: " + name);
    }
}
