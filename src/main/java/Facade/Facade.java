package Facade;

// 外观类
class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;
    private SubsystemC subsystemC;

    public Facade() {
        subsystemA = new SubsystemA();
        subsystemB = new SubsystemB();
        subsystemC = new SubsystemC();
    }

    // 外观类提供的简化接口
    public void simplifiedOperation() {
        subsystemA.operationA();
        subsystemB.operationB();
        subsystemC.operationC();
    }

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.simplifiedOperation(); // 通过外观类调用子系统功能
    }
}