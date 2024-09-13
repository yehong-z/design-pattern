package Visitor;

// 抽象访问者
public interface Visitor {
    void visit(Book book);
    void visit(CD cd);
}