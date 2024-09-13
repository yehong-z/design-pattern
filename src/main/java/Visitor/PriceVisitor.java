package Visitor;

// 具体访问者
public class PriceVisitor implements Visitor {
    @Override
    public void visit(Book book) {
        System.out.println("The price of the book \"" + book.getTitle() + "\" is $10.");
    }

    @Override
    public void visit(CD cd) {
        System.out.println("The price of the CD \"" + cd.getTitle() + "\" is $15.");
    }
}