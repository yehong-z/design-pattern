package Bridge;

public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor(), 10);
        redCircle.draw();

        Shape blueCircle = new Circle(new BlueColor(), 15);
        blueCircle.draw();
    }
}