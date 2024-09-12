package State;

// 具体状态A
class ConcreteStateA implements State {
    public void handleRequest() {
        System.out.println("Handling request in State A");
    }
}