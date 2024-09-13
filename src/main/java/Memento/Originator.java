package Memento;

// 1. 发起人
class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    // 创建备忘录
    public Memento createMemento() {
        return new Memento(state);
    }

    // 恢复状态
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

    // 内部类：备忘录
    public static class Memento {
        private final String state;

        private Memento(String state) {
            this.state = state;
        }

        private String getState() {
            return state;
        }
    }
}