package State;

// 上下文
class Context {
    private State currentState;

    public Context(State initialState) {
        this.currentState = initialState;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void request() {
        currentState.handleRequest();
    }

    public static void main(String[] args) {
        State stateA = new ConcreteStateA();
        State stateB = new ConcreteStateB();

        Context context = new Context(stateA);

        context.request();  // 输出: Handling request in State A

        context.setState(stateB);
        context.request();  // 输出: Handling request in State B
    }
}