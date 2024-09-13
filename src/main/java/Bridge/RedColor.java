package Bridge;

// 具体实现类
public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying Red Color");
    }
}
