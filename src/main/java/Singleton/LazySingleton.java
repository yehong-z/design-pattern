package Singleton;

public class LazySingleton {
    // 延迟实例化
    private static LazySingleton instance;

    // 私有构造函数，防止外部实例化
    private LazySingleton() {}

    // 提供公共的静态方法获取唯一实例
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
