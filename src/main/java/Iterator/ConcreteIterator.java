package Iterator;


import java.util.List;

// 3. 具体迭代器
class ConcreteIterator implements Iterator {
    private List<Object> items;
    private int position = 0;

    public ConcreteIterator(List<Object> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public Object next() {
        return hasNext() ? items.get(position++) : null;
    }


}