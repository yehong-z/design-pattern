package Builder;

// 具体建造者
class ConcreteBuilder implements Builder {
    private Product product = new Product();

    public void buildPartA() {
        product.setPartA("Part A");
    }

    public void buildPartB() {
        product.setPartB("Part B");
    }

    public void buildPartC() {
        product.setPartC("Part C");
    }

    public Product getResult() {
        return product;
    }
}