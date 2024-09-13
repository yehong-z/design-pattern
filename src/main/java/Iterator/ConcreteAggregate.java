package Iterator;

import java.util.ArrayList;
import java.util.List;

// 4. 具体集合
class ConcreteAggregate implements Aggregate {
    private List<Object> items = new ArrayList<>();

    public void addItem(Object item) {
        items.add(item);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(items);
    }


    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.addItem("Item 1");
        aggregate.addItem("Item 2");
        aggregate.addItem("Item 3");

        Iterator iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}