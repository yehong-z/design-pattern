package ResponsibilityChain;
// 处理者接口
public abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String request);

    public static void main(String[] args) {
        // 创建处理者
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();

        // 设置责任链
        handlerA.setNextHandler(handlerB);

        // 发送请求
        handlerA.handleRequest("A"); // 输出: ConcreteHandlerA handles request A
        handlerA.handleRequest("B"); // 输出: ConcreteHandlerB handles request B
        handlerA.handleRequest("C"); // 无输出，因为没有处理请求C的处理者
    }
}