package Decorator;

// 具体装饰器
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", with milk";
    }

    public double cost() {
        return decoratedCoffee.cost() + 1.5;
    }
}