package Composite;

// 1. 组件
abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void showDetails();
}