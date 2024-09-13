package Flyweight;

import java.util.HashMap;
import java.util.Map;

// 享元工厂
public class FlyweightFactory {
    private Map<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String intrinsicState) {
        Flyweight flyweight = flyweights.get(intrinsicState);

        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(intrinsicState);
            flyweights.put(intrinsicState, flyweight);
        }

        return flyweight;
    }

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        // 获取享元对象
        Flyweight flyweight1 = factory.getFlyweight("State1");
        Flyweight flyweight2 = factory.getFlyweight("State2");
        Flyweight flyweight3 = factory.getFlyweight("State1"); // 重用相同的状态

        // 使用享元对象
        flyweight1.operation("ExternalState1");
        flyweight2.operation("ExternalState2");
        flyweight3.operation("ExternalState3");
    }
}