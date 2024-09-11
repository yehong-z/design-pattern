package Decorator;

// 具体组件
// 具体组件
class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Simple coffee";
    }

    public double cost() {
        return 5.0;
    }
}