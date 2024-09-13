package Visitor;


// 具体元素 CD
public class CD implements Element {
    private String title;

    public CD(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}