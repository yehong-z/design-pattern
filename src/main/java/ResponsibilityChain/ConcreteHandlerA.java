package ResponsibilityChain;

// 具体处理者A
public class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("A")) {
            System.out.println("ConcreteHandlerA handles request A");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}