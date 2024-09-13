package Singleton;

public class EagerSingleton {
    // 在类加载时就创建实例
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    // 私有构造函数，防止外部实例化
    private EagerSingleton() {}

    // 提供公共的静态方法获取唯一实例
    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
