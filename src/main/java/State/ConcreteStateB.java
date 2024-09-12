package State;

// 具体状态B
class ConcreteStateB implements State {
    public void handleRequest() {
        System.out.println("Handling request in State B");
    }
}
