package Singleton;

public class Singleton {
    // 静态内部类
    private static class SingletonHelper {
        // 类加载时初始化
        private static final Singleton INSTANCE = new Singleton();
    }

    // 私有构造函数，防止外部实例化
    private Singleton() {}

    // 提供公共的静态方法获取唯一实例
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}