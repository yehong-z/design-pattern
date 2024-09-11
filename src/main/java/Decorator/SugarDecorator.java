package Decorator;

// 另一个具体装饰器
class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", with sugar";
    }

    public double cost() {
        return decoratedCoffee.cost() + 0.5;
    }
}