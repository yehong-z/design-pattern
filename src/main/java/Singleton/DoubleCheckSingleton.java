package Singleton;

public class DoubleCheckSingleton {
    // 延迟实例化
    private static volatile DoubleCheckSingleton instance;

    // 私有构造函数，防止外部实例化
    private DoubleCheckSingleton() {}

    // 提供公共的静态方法获取唯一实例
    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
