package Mediator;

// 中介者接口
public interface Mediator {
    void send(String message, Colleague colleague);
}