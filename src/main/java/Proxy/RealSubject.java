package Proxy;

// 真实主体
class RealSubject implements Subject {
    public void request() {
        System.out.println("RealSubject request");
    }
}