package Bridge;

// 抽象类
public abstract class Shape {
    // 持有一个实现部分的引用
    protected Color color;

    // 构造函数
    protected Shape(Color color) {
        this.color = color;
    }

    // 抽象方法，具体实现由子类完成
    public abstract void draw();
}