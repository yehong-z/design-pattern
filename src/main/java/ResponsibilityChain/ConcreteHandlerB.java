package ResponsibilityChain;

// 具体处理者B
public class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("B")) {
            System.out.println("ConcreteHandlerB handles request B");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}