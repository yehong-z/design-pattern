package Factory;

public class Sub extends Operation {
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}
