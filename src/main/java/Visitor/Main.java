package Visitor;

public class Main {
    public static void main(String[] args) {
        // 创建元素
        Book book1 = new Book("Design Patterns");
        CD cd1 = new CD("The Best of Jazz");

        // 创建对象结构并添加元素
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(book1);
        objectStructure.addElement(cd1);

        // 创建访问者
        Visitor priceVisitor = new PriceVisitor();

        // 使用访问者访问对象结构中的元素
        objectStructure.accept(priceVisitor);
    }
}